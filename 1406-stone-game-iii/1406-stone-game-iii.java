class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int len = stoneValue.length;
        int[] dp = new int[len + 1];
        dp[len] = 0;

        for(int i = len - 1; i >= 0; i--) {
            dp[i] = Integer.MIN_VALUE;

            int sum = 0;

            for(int j = i; j < Math.min(i + 3, len); j++) {
                sum += stoneValue[j];
                dp[i] = Math.max(dp[i], sum - dp[j + 1]);
            }
        }

        if(dp[0] > 0) {
            return "Alice";
        }
        if(dp[0] < 0) {
            return "Bob";
        }

        return "Tie";
    }
}