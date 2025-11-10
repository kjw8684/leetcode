class Solution {
    public int minOperations(int[] nums) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int len = nums.length, count = 0;
        if(nums[0] != 0) {
            count++;
            queue.add(nums[0]);
        }

        for(int i = 1; i < len; i++) {
            if(nums[i] == 0) {
                queue.clear();
            }
            else if(nums[i - 1] > nums[i]) {
                while(!queue.isEmpty() && queue.peek() > nums[i]) {
                    queue.poll();
                }
                if(queue.isEmpty() || (!queue.isEmpty() && queue.peek() != nums[i])) {
                    queue.add(nums[i]);
                    count++;
                }
            }
            else if(nums[i - 1] < nums[i]) {
                queue.add(nums[i]);
                count++;
            }
        }

        return count;
    }
}