class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int count = 0, min = 101, index = -1;
        int[] Answer = new int[k], temp = new int[mat.length];
        for(int i = 0; i < mat.length; i++){
            count = 0;
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }
            temp[i] = count;
        }
        for(int i = 0; i < k; i++){
            min = 101;
            index = -1;
            for(int j = 0; j < temp.length; j++){
                if(temp[j] < min){
                    min = temp[j];
                    index = j;
                }
            }
            Answer[i] = index;
            temp[index] = 101;
        }
        return Answer;
    }
}