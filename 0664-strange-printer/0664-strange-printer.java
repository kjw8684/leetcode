class Solution {
    public int strangePrinter(String s) {
        int len = s.length();
        char[] schar = s.toCharArray();
        int[][] dp = new int[len][len];
        for(int[] line : dp) {
            Arrays.fill(line, -1);
        }
        return Util(0, len - 1, schar, dp);
    }

    public int Util(int i, int j, char[] schar, int[][] dp) {
        if(i > j) {
            return 0;
        }

        if(dp[i][j] != -1) {
            return dp[i][j];
        }

        int fLetter = schar[i], answer = 1 + Util(i + 1, j, schar, dp);

        for(int k = i + 1; k <= j; k++) {
            if(schar[k] == fLetter) {
                answer = Math.min(answer, Util(i, k - 1, schar, dp) + Util(k + 1, j, schar, dp));
            }
        }

        return dp[i][j] = answer;
    }
}