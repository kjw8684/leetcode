class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int rlen = matrix.length, clen = matrix[0].length, min = 100000, cur = 0, count = 0;
        long sum = 0;

        for(int i = 0; i < rlen; i++) {
            for(int j = 0; j < clen; j++) {
                if(matrix[i][j] < 0) {
                    count++;
                }
                cur = Math.abs(matrix[i][j]);
                sum += cur;
                min = Math.min(min, cur);
            }
        }

        if(count % 2 == 1) {
            return sum - (min * 2);
        }

        return sum;
    }
}