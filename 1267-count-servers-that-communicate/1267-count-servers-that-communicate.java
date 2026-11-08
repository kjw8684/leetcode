class Solution {
    public int countServers(int[][] grid) {
        int sum = 0, allone = 0, row = grid.length, col = grid[0].length;
        int[] rowsum = new int[row];
        int[] colsum = new int[col];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(grid[i][j] == 1) {
                    sum++;
                    rowsum[i]++;
                    colsum[j]++;
                }
            }
        }

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(grid[i][j] == 1 && rowsum[i] == 1 && colsum[j] == 1) {
                    allone++;
                    break;
                }
            }
        }

        return sum - allone;
    }
}