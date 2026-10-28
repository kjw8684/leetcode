class Solution {
    public int minCost(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        boolean[][][] dp = new boolean[row][col][1024];
        dp[0][0][grid[0][0]] = true;

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(i > 0) {
                    for(int k = 0; k < 1024; k++) {
                        if(dp[i - 1][j][k]) {
                            dp[i][j][k ^ grid[i][j]] = true;
                        }
                    }
                }
                if(j > 0) {
                    for(int k = 0; k < 1024; k++) {
                        if(dp[i][j - 1][k]) {
                            dp[i][j][k ^ grid[i][j]] = true;
                        }
                    }
                }
            }
        }

        for(int i = 0; i < 1024; i++) {
            if(dp[row - 1][col - 1][i]) {
                return i;
            }
        }

        return -1;
    }
}