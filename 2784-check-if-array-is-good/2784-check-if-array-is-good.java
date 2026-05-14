class Solution {
    public boolean isGood(int[] nums) {
        int len = nums.length;
        if(len == 1) {
            return false;
        }
        Arrays.sort(nums);

        for(int i = 1; i < len - 1; i++) {
            if(nums[i] != nums[i - 1] + 1) {
                return false;
            }
        }

        return nums[len - 1] == len - 1 &&  nums[len - 2] == len - 1;
    }
}