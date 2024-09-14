class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0, count = 0,temp_count = 0, len = nums.length;
        boolean cheak = false;

        for(int i = 0; i < len; i++) {
            if(nums[i] > max) {
                max = nums[i];
                count = 1;
                cheak = true;
            }
            else if(cheak && nums[i] == max) {
                count++;
            }
            else if(!cheak && nums[i] == max) {
                temp_count++;
            }
            else {
                count = Math.max(count, temp_count);
                cheak = false;
                temp_count = 0;
            }
        }

        return count;
    }
}