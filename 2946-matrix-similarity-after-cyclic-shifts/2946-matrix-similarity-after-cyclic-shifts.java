class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int col = mat.length, row = mat[0].length;

        for(int i = 0; i < col; i++) {
            for(int j = 0; j < row; j++) {
                if(mat[i][(j + k) % row] != mat[i][j]) {
                        return false;
                }
            }
        }

        return true;
    }
}