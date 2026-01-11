class Solution {
    public int maximalRectangle(char[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        int[][] dp = new int[row][col];

        for(int i = 0; i < row; i++) {
            int count = 0;
            for(int j = col - 1; j >= 0; j--) {
                if(matrix[i][j] == '0') {
                    count = 0;
                }
                else {
                    count++;
                }

                dp[i][j] = count;
            }
        }

        for(int i = 0; i < row; i++) {
            int count = 0;
            for(int j = 0; j < col; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        int max = 0;

        for(int i = 0; i < col; i++) {
            int before = 0, count = 1;
            for(int j = 0; j < row; j++) {
                if(before != 0) {
                    before = Math.min(before, dp[j][i]);
                    count++;
                }
                else {
                    before = dp[j][i];
                    count = 1;
                }
                max = Math.max(max, before * count);
            }
        }

        return max;
    }
}