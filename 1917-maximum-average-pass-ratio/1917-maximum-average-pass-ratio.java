class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> pq = new PriorityQueue<>(
            (a, b) -> Double.compare(
                (b[0] + 1) / (b[1] + 1) - b[0] / b[1],
                (a[0] + 1) / (a[1] + 1) - a[0] / a[1]
            )
        );

        for (int[] c : classes) {
            pq.add(new double[]{c[0], c[1]});
        }

        while (extraStudents-- > 0) {
            double[] cur = pq.poll();
            cur[0]++;
            cur[1]++;
            pq.add(cur);
        }

        double answer = 0;
        while (!pq.isEmpty()) {
            double[] cur = pq.poll();
            answer += cur[0] / cur[1];
        }
        return answer / classes.length;
    }
}
