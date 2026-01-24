class Solution {
    public int minPairSum(int[] nums) {
        int len = nums.length, half = len / 2, max = 0;
        Arrays.sort(nums);

        for(int i = 0; i < half; i++) {
            max = Math.max(max, nums[i] + nums[len - i - 1]);
        }

        return max;
    }
}