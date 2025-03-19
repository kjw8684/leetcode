class Solution {
    public int minOperations(int[] nums) {
        int len = nums.length, count = 0;

        for(int i = 2; i < len; i++) {
            if(nums[i - 2] == 0) {
                count++;
                flip(nums, i);
            }
        }

        if(nums[len - 2] == 1 && nums[len - 1] == 1) {
            return count;
        }
        return -1;
    }

    public void flip(int[] nums, int index) {
        for(int i = 1; i >= 0; i--) {
            nums[index - i] = Math.abs(nums[index - i] - 1);
        }
    }
}