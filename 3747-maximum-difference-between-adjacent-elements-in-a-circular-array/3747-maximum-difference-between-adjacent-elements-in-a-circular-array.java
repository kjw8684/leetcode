class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int len = nums.length, max = 0;

        max = Math.max(Math.max(Math.abs(nums[0] - nums[len - 1]), Math.abs(nums[len - 1] - nums[0])), max);

        for(int i = 1; i < len; i++) {
            max = Math.max(max, Math.max(Math.abs(nums[i] - nums[i - 1]), Math.abs(nums[i - 1] - nums[i])));
        }

        return max;
    }
}