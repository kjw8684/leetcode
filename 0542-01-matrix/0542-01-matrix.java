class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int count = 1;
        boolean check = true;
        while(true){
            check = true;
            for(int i = 0; i < mat.length; i++){
                for(int j = 0; j < mat[0].length; j++){
                    if(mat[i][j] < count){
                        continue;
                    }
                    if(i > 0){
                        if(mat[i - 1][j] < count){
                            mat[i][j] = count;
                            check = false;
                            continue;
                        }
                    }
                    if(j > 0){
                        if(mat[i][j - 1] < count){
                            mat[i][j] = count;
                            check = false;
                            continue;
                        }
                    }
                    if(i < mat.length - 1){
                        if(mat[i + 1][j] < count){
                            mat[i][j] = count;
                            check = false;
                            continue;
                        }
                    }
                    if(j < mat[0].length - 1){
                        if(mat[i][j + 1] < count){
                            mat[i][j] = count;
                            check = false;
                            continue;
                        }
                    }
                    mat[i][j] = count + 1;
                    check = false;
                }
            }
            if(check){
                break;
            }
            count++;
        }
        return mat;
    }
}