class Solution {
    int row = 0, col = 0;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        row = grid1.length;
        col = grid1[0].length;
        int count = 0;
        boolean[][] visited = new boolean[row][col];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(grid1[i][j] == 1 && grid2[i][j] == 1 && !visited[i][j] && search(grid1, grid2, visited, i, j)) {
                    count++;
                }
            }
        }

        return count;
    }

    public boolean search(int[][] grid1, int[][] grid2, boolean[][] visited, int i, int j) {
        visited[i][j] = true;
        boolean cheak = true;
        if(i != 0 && grid2[i - 1][j] == 1 && !visited[i - 1][j]) {
            if(!search(grid1, grid2, visited, i - 1, j) || grid1[i - 1][j] == 0) {
                cheak = false;
            }
        }
        if(i + 1 < row && grid2[i + 1][j] == 1 && !visited[i + 1][j]) {
            if(!search(grid1, grid2, visited, i + 1, j) || grid1[i + 1][j] == 0) {
                cheak = false;
            }
        }
        if(j != 0 && grid2[i][j - 1] == 1 && !visited[i][j - 1]) {
            if(!search(grid1, grid2, visited, i, j - 1) || grid1[i][j - 1] == 0) {
                cheak = false;
            }
        }
        if(j + 1 < col && grid2[i][j + 1] == 1 && !visited[i][j + 1]) {
            if(!search(grid1, grid2, visited, i, j + 1) || grid1[i][j + 1] == 0) {
                cheak = false;
            }
        }

        return cheak;
    }
}