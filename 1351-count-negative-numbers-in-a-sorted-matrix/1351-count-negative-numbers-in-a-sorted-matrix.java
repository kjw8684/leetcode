class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0, len = grid[0].length;

        for(int[] cur : grid) {
            for(int i = len - 1; i >= 0; i--) {
                if(cur[i] >= 0) {
                    break;
                }
                count++;
            }
        }

        return count;
    }
}