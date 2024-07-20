class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int rowlen = rowSum.length, collen = colSum.length;
        int[][] answer = new int[rowlen][collen];

        for(int i = 0; i < rowlen; i++) {
            for(int j = 0; j < collen; j++) {
                if(rowSum[i] < colSum[j]) {
                    colSum[j] -= rowSum[i];
                    answer[i][j] = rowSum[i];
                    rowSum[i] = 0;
                }
                else if(rowSum[i] > colSum[j]) {
                    answer[i][j] = colSum[j];
                    rowSum[i] -= colSum[j];
                    colSum[j] = 0;
                }
                else {
                    answer[i][j] = rowSum[i];
                    rowSum[i] = 0;
                    colSum[j] = 0;
                }
            }
        }
        
        return answer;
    }
}