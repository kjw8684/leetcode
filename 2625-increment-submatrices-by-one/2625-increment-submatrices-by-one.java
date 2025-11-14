class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] answer = new int[n][n];

        for(int[] querie : queries) {
            add(answer, querie[0], querie[1], querie[2], querie[3]);
        }

        return answer;
    }

    public void add(int[][] matrix, int startrow, int startcol, int endrow, int endcol) {
        for(int i = startrow; i <= endrow; i++) {
            for(int j = startcol; j <= endcol; j++) {
                matrix[i][j]++;
            }
        }
    }
}