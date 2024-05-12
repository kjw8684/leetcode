class Solution {
    public int[][] largestLocal(int[][] grid) {
        int len = grid.length;
        int[][] maxLocal = new int[len - 2][len - 2];
        
        for(int i = 1; i < len - 1; i++) {
            for(int j = 1; j < len - 1; j++) {
                maxLocal[i - 1][j - 1] = countSurroundingMine(grid, i, j);
            }
        }
        
        return maxLocal;
    }
    
    public static int countSurroundingMine(int[][] array, int x, int y) {
        int max = array[x][y];
        
        for (int i =-1; i <=1; i++) {
            for (int j =-1; j <=1; j++) {
                if (!(i ==0 && j ==0) && x + i >=0 && x + i < array.length && y + j >=0 && y + j < array[0].length) {
                    max = Math.max(max, array[x + i][y + j]);
                }
            }
        }
        
        return max;
    }
}