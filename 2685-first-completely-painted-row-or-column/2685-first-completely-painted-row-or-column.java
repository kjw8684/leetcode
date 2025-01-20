class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int rowLen = mat.length, colLen = mat[0].length, count = 0;
        int[] row = new int[rowLen], col = new int[colLen];
        int[][] nums = new int[arr.length][2];
        

        for(int i = 0; i < rowLen; i++) {
            for(int j = 0; j < colLen; j++) {
                nums[mat[i][j] - 1][0] = i;
                nums[mat[i][j] - 1][1] = j;
            }
        }

        for(int num : arr) {
            row[nums[num - 1][0]]++;
            col[nums[num - 1][1]]++;
            if(row[nums[num - 1][0]] == colLen || col[nums[num - 1][1]] == rowLen) {
                return count;
            }
            count++;
        }

        return -1;
    }
}