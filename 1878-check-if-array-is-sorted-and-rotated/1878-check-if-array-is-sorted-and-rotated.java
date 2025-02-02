class Solution {
    public boolean check(int[] nums) {
        int len = nums.length;
        boolean issorted = true;

        for(int i = 1; i < len; i++) {
            if(!issorted && nums[i - 1] > nums[i]) {
                return false;
            }

            if(nums[i - 1] > nums[i]) {
                issorted = false;
            }
        }

        return issorted || nums[len - 1] <= nums[0];
    }
}