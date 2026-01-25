class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k == 1) {
            return 0;
        }
        int len = nums.length, min = 100000;
        Arrays.sort(nums);

        for(int i = k - 1; i < len; i++) {
            min = Math.min(min, nums[i] - nums[i - k + 1]);
        }

        return min;
    }
}