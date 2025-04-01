class Solution {
    public long mostPoints(int[][] questions) {
        int len = questions.length;
        long[] dp = new long[len];
        for (int i = len - 1; i >= 0; i--) {
            int index = i + questions[i][1] + 1;
            if (index < len) {
                dp[i] = dp[index] + questions[i][0];
            } else {
                dp[i] = questions[i][0];
            }
            if (i < len - 1) {
                dp[i] = Math.max(dp[i + 1], dp[i]);
            }
        }
        return dp[0];
    }
}