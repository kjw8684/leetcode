class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int[][] dp = new int[n][forget];
        dp[0][0] = 1;

        for(int i = 1; i < n; i++) {
            int sum = 0;
            for(int j = forget - 1; j > 0; j--) {
                dp[i][j] = dp[i - 1][j - 1];
                if(j - delay >= 0) {
                    sum += dp[i][j];
                    sum %= 1000000007;
                }
            }
            dp[i][0] = sum;
        }

        int sum = 0;
        for(int i = 0; i < forget; i++) {
            sum += dp[n - 1][i];
            sum %= 1000000007;
        }

        return sum;
    }
}