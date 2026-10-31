class Solution {
    public int uniquePaths(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        int MOD = 1_000_000_007;
        int[][] dp = new int[row][col];
        dp[0][0] = 1;

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(i > 0) {
                    if(grid[i - 1][j] == 0) {
                        dp[i][j] += dp[i - 1][j];
                    }
                    else {
                        int x = i - 1, y = j;
                        boolean up = false;

                        while(x != -1 && y != -1 && grid[x][y] == 1) {
                            if(up) {
                                x--;
                            }
                            else {
                                y--;
                            }
                            up = !up;
                        }

                        if(x != -1 && y != -1) {
                            dp[i][j] += dp[x][y];
                        }
                    }
                }
                if(j > 0) {
                    if(grid[i][j - 1] == 0) {
                        dp[i][j] += dp[i][j - 1];
                    }
                    else {
                        int x = i, y = j - 1;
                        boolean up = true;

                        while(x != -1 && y != -1 && grid[x][y] == 1) {
                            if(up) {
                                x--;
                            }
                            else {
                                y--;
                            }
                            up = !up;
                        }

                        if(x != -1 && y != -1) {
                            dp[i][j] += dp[x][y];
                        }
                    }
                }
                dp[i][j] %= MOD;
            }
        }

        return dp[row - 1][col - 1];
    }
}