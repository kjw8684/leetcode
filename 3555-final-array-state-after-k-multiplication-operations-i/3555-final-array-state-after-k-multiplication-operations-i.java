class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int min = 0, len = nums.length, index = 0;

        for(int i = 0; i < k; i++) {
            min = 1000000000;
            index = 0;
            for(int j = 0; j < len; j++) {
                if(min > nums[j]) {
                    index = j;
                    min = nums[j];
                }
            }

            nums[index] *= multiplier;
        }

        return nums;
    }
}