class Solution {
    public int minimizeSum(int[] nums) {
        int max = 0, min = 0, len = nums.length;

        Arrays.sort(nums);
        min = nums[len - 1] - nums[0];

        min = Math.min(min, Math.min(nums[len - 2] - nums[1], Math.min(nums[len - 3] - nums[0], nums[len - 1] - nums[2])));

        return min;
    }
}