class Solution {
    public int minFallingPathSum(int[][] grid) {
        int len = grid.length, min1, min2;
        int[] current = new int[len];
        for(int i = 1; i < len; i++) {
            min1 = Integer.MAX_VALUE;
            min2 = Integer.MAX_VALUE;
            for(int j = 0; j < len; j++) {
                if(min1 <= grid[i - 1][j] && min2 > grid[i - 1][j]) {
                    min2 = grid[i - 1][j];
                }
                else if(min1 > grid[i - 1][j]) {
                    min2 = min1;
                    min1 = grid[i - 1][j];
                }
            }
            for(int j = 0; j < len; j++) {
                if(min1 == grid[i - 1][j]) {
                    grid[i][j] += min2;
                }
                else{
                    grid[i][j] += min1;
                }
            }
        }
        
        Arrays.sort(grid[len - 1]);
        
        return grid[len - 1][0];
    }
}