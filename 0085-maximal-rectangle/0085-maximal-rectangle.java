class Solution {
    int x_len, y_len;
    public int maximalRectangle(char[][] matrix) {
        x_len = matrix.length;
        y_len = matrix[0].length;
        int answer = 0;
        
        for(int i = 0; i < x_len; i++) {
            if((x_len - i) * y_len < answer) {
                break;
            }
            for(int j = 0; j < y_len; j++) {
                if(matrix[i][j] == '1') {
                    answer = Math.max(answer, isRectangle(matrix, i, j));
                }
            }
        }
        
        return answer;
    }
    
    public int isRectangle(char[][] matrix, int x, int y) {
        int max = 0, depth = y_len;
        for(int i = x; i < x_len; i++) {
            for(int j = y; j < depth; j++) {
                if(matrix[i][j] == '0') {
                    depth = j;
                    break;
                }
            }
            max = Math.max(max, (i - x + 1) * (depth - y));
        }
        
        
        
        return max;
    }
}