class Solution {
    public int minimumCost(int[] nums) {
        int sum = nums[0];
        nums[0] = 100;
        Arrays.sort(nums);

        return sum + nums[0] + nums[1];
    }
}