class Solution {
    public int maxAscendingSum(int[] nums) {
        int len = nums.length, sum = nums[0], max = 0;

        for(int i = 1; i < len; i++) {
            if(nums[i - 1] < nums[i]) {
                sum += nums[i];
            }
            else {
                max = Math.max(max, sum);
                sum = nums[i];
            }
        }

        return Math.max(max, sum);
    }
}