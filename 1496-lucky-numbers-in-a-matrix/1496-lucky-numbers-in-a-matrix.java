class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> answer = new ArrayList<>();
        int xlen = matrix.length, ylen = matrix[0].length, min = 0, miny = 0;
        boolean cheak = true;

        for(int i = 0; i < xlen; i++) {
            min = matrix[i][0];
            miny = 0;
            for(int j = 1; j < ylen; j++) {
                if(min > matrix[i][j]) {
                    miny = j;
                    min = matrix[i][j];
                }
            }

            cheak = true;
            for(int j = 0; j < xlen; j++) {
                if(i != j && matrix[j][miny] > min) {
                    cheak = false;
                    break;
                } 
            }

            if(cheak) {
                answer.add(min);
            }
        }

        return answer;
    }
}