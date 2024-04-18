class Solution {
    public int islandPerimeter(int[][] grid) {
        int x_len = grid.length, y_len = grid[0].length, perimeter = 0;
        for(int i = 0; i < x_len; i++) {
            for(int j = 0; j < y_len; j++) {
                if(grid[i][j] == 1) {
                    if(i == 0 || (i > 0 && grid[i - 1][j] == 0)) {
                        perimeter++;
                    }
                    
                    if(j == 0 || (j > 0 && grid[i][j - 1] == 0)) {
                        perimeter++;
                    }
                    
                    if(i == x_len - 1 || (i < x_len - 1 && grid[i + 1][j] == 0)) {
                        perimeter++;
                    }
                    
                    if(j == y_len - 1 || (j < y_len - 1 && grid[i][j + 1] == 0)) {
                        perimeter++;
                    }
                }
            }
        }
        
        return perimeter;
    }
}