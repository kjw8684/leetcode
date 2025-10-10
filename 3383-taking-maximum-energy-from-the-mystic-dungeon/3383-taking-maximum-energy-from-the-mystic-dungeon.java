class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int len = energy.length, max = -1000;
        int[] dp = new int[len];

        for(int i = len - 1; i >= len - k; i--) {
            dp[i] = energy[i];
            max = Math.max(max, dp[i]);
        }

        for(int i = len - k - 1; i >= 0; i--) {
            dp[i] = energy[i] + dp[i + k];
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}