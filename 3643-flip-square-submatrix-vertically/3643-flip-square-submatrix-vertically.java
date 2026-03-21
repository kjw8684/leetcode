class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int xlen = k / 2, ylen = y + k, temp = 0;

        for(int i = 0; i < xlen; i++) {
            for(int j = y; j < ylen; j++) {
                temp = grid[x + i][j];
                grid[x + i][j] = grid[x + k - i - 1][j];
                grid[x + k - i - 1][j] = temp;
            }
        }

        return grid;
    }
}