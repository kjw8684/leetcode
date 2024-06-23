class Solution {
    public int longestSubarray(int[] nums, int limit) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        int max = 1, start = 0, end = 0, len = nums.length;

        while(end < len) {
            if(minHeap.isEmpty()) {
                minHeap.add(nums[end]);
                maxHeap.add(nums[end]);
                end++;
            }
            
            while(end < len && maxHeap.peek() - minHeap.peek() <= limit) {
                minHeap.add(nums[end]);
                maxHeap.add(nums[end]);
                end++;
            }
            
            max = Math.max(max, end - start - 1);
            
            while(start < end && maxHeap.peek() - minHeap.peek() > limit) {
                minHeap.remove(nums[start]);
                maxHeap.remove(nums[start]);
                start++;
            }
            
            max = Math.max(max, end - start);
        }
        
        return max;
    }
}