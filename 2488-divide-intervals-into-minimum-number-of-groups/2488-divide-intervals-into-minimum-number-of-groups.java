class Solution {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int len = intervals.length, max = 1;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i = 0; i < len; i++) {
            while(!queue.isEmpty() && intervals[i][0] > queue.peek()) {
                queue.poll();
            }
            queue.offer(intervals[i][1]);
            max = Math.max(max, queue.size());
        }

        return max;
    }
}