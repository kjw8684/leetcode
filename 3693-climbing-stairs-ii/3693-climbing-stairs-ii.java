class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = costs[0] + 1;
        if(n > 1) {
            dp[1] = costs[1] + 4;
        }
        if(n > 2) {
            dp[2] = costs[2] + 9;
        }

        for(int i = 0; i < n - 1; i++) {
            dp[i + 1] = Math.min(dp[i + 1], dp[i] + costs[i + 1] + 1);
            if(i < n - 2) {
                dp[i + 2] = Math.min(dp[i + 2], dp[i] + costs[i + 2] + 4);
            }
            if(i < n - 3) {
                dp[i + 3] = Math.min(dp[i + 3], dp[i] + costs[i + 3] + 9);
            }
        }

        return dp[n - 1];
    }
}