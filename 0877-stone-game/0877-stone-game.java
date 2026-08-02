class Solution {
    public boolean stoneGame(int[] piles) {
        int len = piles.length;
        int[][] dp = new int[len][len];

        for (int i = 0; i < len; i++) {
            dp[i][i] = piles[i];
        }

        for (int length = 2; length <= len; length++) {
            for (int l = 0; l <= len - length; l++) {
                int r = l + length - 1;

                dp[l][r] = Math.max(
                    piles[l] - dp[l + 1][r],
                    piles[r] - dp[l][r - 1]
                );
            }
        }

        return dp[0][len - 1] >= 0;
    }
}