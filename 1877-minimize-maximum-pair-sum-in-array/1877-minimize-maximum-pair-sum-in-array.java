class Solution {
    public int minPairSum(int[] nums) {
        int len = nums.length, max = 0;
        Arrays.sort(nums);

        for(int i = 0; i < len / 2; i++) {
            max = Math.max(max, nums[i] + nums[len - i - 1]);
        }

        return max;
    }
}