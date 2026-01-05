class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int min = Math.abs(matrix[0][0]), count = 0;
        long sum = 0L;
        boolean zero = false;

        for(int[] curRow : matrix) {
            for(int cur : curRow) {
                if(cur < 0) {
                    count++;
                }
                else if(cur == 0) {
                    zero = true;
                }
                int abs = Math.abs(cur);
                if(abs < min) {
                    min = abs;
                }

                sum += abs;
            }
        }

        if(zero || count % 2 == 0) {
            return sum;
        }

        return sum - min * 2;
    }
}