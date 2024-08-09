class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int row = grid.length - 3, col = grid[0].length - 3, answer = 0;

        for(int i = 0; i <= row; i++) {
            for(int j = 0; j <= col; j++) {
                if(cheak(grid, i, j)) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public boolean cheak(int[][] grid, int row, int col) {
        boolean[] cheaking = new boolean[9];

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(grid[row + i][col + j] < 10 && grid[row + i][col + j] > 0) {
                    cheaking[grid[row + i][col + j] - 1] = true;
                }
            }
        }

        if(cheaking[0] && cheaking[1] && cheaking[2] && cheaking[3] && cheaking[4] && cheaking[5] && cheaking[6] && cheaking[7] && cheaking[8] && grid[row][col] + grid[row][col + 1] + grid[row][col + 2] == 15 && grid[row + 1][col] + grid[row + 1][col + 1] + grid[row + 1][col + 2] == 15 && grid[row + 2][col] + grid[row + 2][col + 1] + grid[row + 2][col + 2] == 15 && grid[row][col] + grid[row + 1][col] + grid[row + 2][col] == 15 && grid[row][col + 1] + grid[row + 1][col + 1] + grid[row + 2][col + 1] == 15 && grid[row][col + 2] + grid[row + 1][col + 2] + grid[row + 2][col + 2] == 15 && grid[row][col] + grid[row + 1][col + 1] + grid[row + 2][col + 2] == 15 && grid[row][col + 2] + grid[row + 1][col + 1] + grid[row + 2][col] == 15) {
            return true;
        }

        return false;
    }
}