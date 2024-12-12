class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;

        for(int cur : gifts) {
            queue.add(cur);
        }

        for(int i = 0; i < k; i++) {
            queue.add((int)Math.sqrt(queue.poll()));
        }

        while(!queue.isEmpty()) {
            sum += queue.poll();
        }

        return sum;
    }
}