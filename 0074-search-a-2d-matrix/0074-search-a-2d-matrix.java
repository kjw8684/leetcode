class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 1){
            for(int i = 0; i < matrix[0].length; i++){
                if(matrix[0][i] == target){
                    return true;
                }
            }
            return false;
        }
        for(int i = 0; i < matrix.length; i++){
            if(i + 1 >= matrix.length){
                for(int j = 0; j < matrix[i].length; j++){
                    if(matrix[i][j] == target){
                        return true;
                    }
                }
                return false;
            }
            else if(matrix[i + 1][0] > target){
                for(int j = 0; j < matrix[i].length; j++){
                    if(matrix[i][j] == target){
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }
}