class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;

        for(int num : nums) {
            sum += num;
        }

        if(sum % 2 == 1) {
            return false;
        }

        sum /= 2;

        boolean[] dp = new boolean[sum + 1];
        dp[0] = true;

        for(int num : nums) {
            for(int curSum = sum; curSum >= num; curSum--) {
                dp[curSum] = dp[curSum] || dp[curSum - num];
                if(dp[sum]) {
                    return true;
                }
            }
        }

        return dp[sum];
    }
}