class Solution {
    public int numIslands(char[][] grid) {
        int x_len = grid.length, y_len = grid[0].length, answer = 0;
        for(int i = 0; i < x_len; i++) {
            for(int j = 0; j < y_len; j++) {
                if(grid[i][j] == '1') {
                    banish(grid, i, j, x_len, y_len);
                    answer++;
                }
            }
        }
        
        return answer;
    }
    
    public void banish(char[][] grid, int x, int y, int x_len, int y_len) {
        grid[x][y] = '0';
        if(x > 0 && grid[x - 1][y] == '1') {
            banish(grid, x - 1, y, x_len, y_len);
        }

        if(y > 0 && grid[x][y - 1] == '1') {
            banish(grid, x, y - 1, x_len, y_len);
        }

        if(x < x_len - 1 && grid[x + 1][y] == '1') {
            banish(grid, x + 1, y, x_len, y_len);
        }

        if(y < y_len - 1 && grid[x][y + 1] == '1') {
            banish(grid, x, y + 1, x_len, y_len);
        }
    }
}