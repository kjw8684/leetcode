class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int row = grid.length, col = grid[0].length, count = 0;
        int[][] dp = new int[row][col];

        for(int i = 0; i < row; i++) {
            int cur = 0;
            for(int j = 0; j < col; j++) {
                cur += grid[i][j];
                dp[i][j] = cur;
            }
        }

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(dp[i][j] <= k) {
                    count++;
                }
                if(i != row - 1) {
                    dp[i + 1][j] += dp[i][j];
                }
            }
        }

        return count;
    }
}