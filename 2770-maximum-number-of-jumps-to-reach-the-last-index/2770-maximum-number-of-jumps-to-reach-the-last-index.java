class Solution {
    public int maximumJumps(int[] nums, int target) {
        int len = nums.length;
        int[] dp = new int[len];

        for(int i = 1; i < len; i++) {
            dp[i] = -1;
        }

        for(int i = 0; i < len; i++) {
            for(int j = i + 1; j < len; j++) {
                if(nums[j] - nums[i] <= target && -1 * target <= nums[j] - nums[i] ) {
                    if(dp[i] != -1 && dp[j] <= dp[i]) {
                        dp[j] = dp[i] + 1;    
                    }
                    
                }
            }
        }

        

        return dp[len - 1];
    }
}