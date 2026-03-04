class Solution {
    int Row = 0, Col = 0;
    public int numSpecial(int[][] mat) {
        int count = 0;
        Row = mat.length;
        Col = mat[0].length;

        for(int i = 0 ; i < Row; i++) {
            for(int j = 0; j < Col; j++) {
                if(check(mat, i, j)) {
                    count++;
                }
            }
        }

        return count;
    }

    public boolean check(int[][] mat, int row, int col) {
        if(mat[row][col] == 0) {
            return false;
        }
        
        for(int i = 0; i < Row; i++) {
            if(i == row) {
                continue;
            }

            if(mat[i][col] == 1) {
                return false;
            }
        }

        for(int i = 0; i < Col; i++) {
            if(i == col) {
                continue;
            }

            if(mat[row][i] == 1) {
                return false;
            }
        }


        return true;
    }
}