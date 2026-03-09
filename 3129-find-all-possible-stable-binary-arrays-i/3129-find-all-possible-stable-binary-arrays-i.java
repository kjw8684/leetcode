class Solution {
    public int numberOfStableArrays(int zero, int one, int limit) {
        int mod = 1000000007;
        int[][] dp0 = new int[zero + 1][one + 1];
        int[][] dp1 = new int[zero + 1][one + 1];

        int min = Math.min(zero, limit);
        for(int i = 1; i <= min; i++){
            dp0[i][0] = 1;
        }
        min = Math.min(one, limit);
        for(int i = 1; i <= min; i++){
            dp1[0][i] = 1;
        }

        for(int i = 1; i <= zero; i++) {
            for(int j = 1; j <= one; j++) {
                min = Math.min(limit, i);
                for(int k = 1; k <= min; k++) {
                    dp0[i][j] = (dp0[i][j] + dp1[i - k][j]) % mod;
                }
                min = Math.min(limit, j);
                for(int k = 1; k <= min; k++) {
                    dp1[i][j] = (dp0[i][j - k] + dp1[i][j]) % mod;
                }
            }
        }

        return (dp0[zero][one] + dp1[zero][one]) % mod;
    }
}