class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int len = nums.length;
        return count(nums, target, 0, len, 0);
    }

    public int count(int[] nums, int target, int index, int len, int sum) {
        if(len == index) {
            if(target == sum) {
                return 1;
            }
            else {
                return 0;
            }
        }

        return count(nums, target, index + 1, len, sum + nums[index]) + count(nums, target, index + 1, len, sum - nums[index]);
    }
}