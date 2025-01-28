class Solution {
    int ROWLEN = 0, COLLEN = 0;
    public int findMaxFish(int[][] grid) {
        ROWLEN = grid.length;
        COLLEN = grid[0].length;
        int max = 0;
        boolean[][] visited = new boolean[ROWLEN][COLLEN];

        for(int i = 0; i < ROWLEN; i++) {
            for(int j = 0; j < COLLEN; j++) {
                if(!visited[i][j] && grid[i][j] != 0) {
                    max = Math.max(max, search(grid, i, j, visited));
                }
            }
        }

        return max;
    }

    public int search(int[][] grid, int i, int j, boolean[][] visited) {
        visited[i][j] = true;
        int sum = grid[i][j];

        if(i > 0 && !visited[i -  1][j] && grid[i - 1][j] > 0) {
            sum += search(grid, i - 1, j, visited);
        }

        if(j > 0 && !visited[i][j - 1] && grid[i][j - 1] > 0) {
            sum += search(grid, i, j - 1, visited);
        }

        if(i < ROWLEN - 1 && !visited[i + 1][j] && grid[i + 1][j] > 0) {
            sum += search(grid, i + 1, j, visited);
        }

        if(j < COLLEN - 1 && !visited[i][j + 1] && grid[i][j + 1] > 0) {
            sum += search(grid, i, j + 1, visited);
        }

        return sum;
    }
}