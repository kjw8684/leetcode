class Solution {
    public int diagonalSum(int[][] mat) {
        int answer = 0;
        if(mat[0].length % 2 == 0){
            for(int i = 0; i < mat[0].length; i++){
                answer += mat[i][i] + mat[i][mat[0].length - i - 1];
            }
        }
        else{
            for(int i = 0; i < mat[0].length; i++){
                answer += mat[i][i] + mat[i][mat[0].length - i - 1];
            }
            answer -= mat[(mat[0].length - 1) / 2][(mat[0].length - 1) / 2];
        }
        return answer;
    }
}