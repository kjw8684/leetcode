class Solution {
    public int minDifference(int[] nums) {
        int len = nums.length, min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        if(len < 5) {
            return 0;
        }

        for(int i = 0; i < 4; i++) {
            min = Math.min(min, nums[len + i - 4] - nums[i]);
        }

        return min;
    }
}