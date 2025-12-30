class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int rlen = grid.length, clen = grid[0].length, count = 0;

        for(int i = 2; i < rlen; i++) {
            for(int j = 2; j < clen; j++) {
                if(check(grid, i - 2, j - 2)) {
                    count++;
                }
            }
        }

        return count;
    }

    public boolean check(int[][] grid, int row, int col) {
        boolean[] digit = new boolean[9];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(grid[row + i][col + j] > 9 || grid[row + i][col + j] < 1) {
                    return false;
                }
                if(digit[grid[row + i][col + j] - 1]) {
                    return false;
                }
                else {
                    digit[grid[row + i][col + j] - 1] = true;
                }
            }
        }

        for(int i = 0; i < 3; i++) {
            if(grid[row + i][col] + grid[row + i][col + + 1] + grid[row + i][col+ 2] != 15) {
                return false;
            }
        }

        for(int i = 0; i < 3; i++) {
            if(grid[row][col + i] + grid[row + 1][col + i] + grid[row + 2][col + i] != 15) {
                return false;
            }
        }

        return grid[row][col] + grid[row + 1][col + 1] + grid[row + 2][col + 2] == 15 && grid[row + 2][col] + grid[row + 1][col + 1] + grid[row][col + 2] == 15;
    }
}