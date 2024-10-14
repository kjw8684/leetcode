class Solution {
    public long maxKelements(int[] nums, int k) {
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        int len = nums.length;
        long answer = 0;

        for(int i = 0; i < len; i++) {
            queue.offer((double)nums[i]);
        }

        for(int i = 0; i < k; i++) {
            answer += (long)queue.peek().doubleValue();
            queue.offer(Math.ceil(queue.poll() / 3));
        }

        return answer;
    }
}