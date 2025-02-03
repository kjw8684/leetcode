class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int len = nums.length, increasing = 1, decreasing = 1, currentIncreasing = 1, currentDecreasing = 1;

        for(int i = 1; i < len; i++) {
            if(nums[i - 1] < nums[i]) {
                decreasing = Math.max(decreasing, currentDecreasing);
                currentIncreasing++;
                currentDecreasing = 1;
            }
            else if(nums[i - 1] > nums[i]) {
                increasing = Math.max(increasing, currentIncreasing);
                currentDecreasing++;
                currentIncreasing = 1;
            }
            else {
                increasing = Math.max(increasing, currentIncreasing);
                decreasing = Math.max(decreasing, currentDecreasing);
                currentIncreasing = 1;
                currentDecreasing = 1;
            }
        }
        increasing = Math.max(increasing, currentIncreasing);
        decreasing = Math.max(decreasing, currentDecreasing);
        
        return Math.max(increasing, decreasing);
    }
}