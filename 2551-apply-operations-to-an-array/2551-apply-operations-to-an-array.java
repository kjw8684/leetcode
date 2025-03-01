class Solution {
    public int[] applyOperations(int[] nums) {
        int len = nums.length;

        for(int i = 1; i < len; i++) {
            if(nums[i - 1] == nums[i]) {
                nums[i - 1] = nums[i - 1] * 2;
                nums[i] = 0;
            }
        }

        for(int i = 0; i < len; i++) {
            for(int j = i + 1; j < len; j++) {
                if(nums[i] == 0 && nums[j] != 0) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
            }
        }

        return nums;
    }
}