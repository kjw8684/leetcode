class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        boolean original = true, rotaedOne = true, rotaedTwice = true, rotaedTherid = true;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(mat[i][j] != target[i][j]) {
                    original = false;
                }
                if(mat[j][n - i - 1] != target[i][j]) {
                    rotaedOne = false;
                }
                if(mat[n - i - 1][n - j - 1] != target[i][j]) {
                    rotaedTwice = false;
                }
                if(mat[n - j - 1][i] != target[i][j]) {
                    rotaedTherid = false;
                }
            }
        }

        return original || rotaedOne || rotaedTwice || rotaedTherid;
    }
}