class Solution {
    public boolean exist(char[][] board, String word) {
        int x_len = board[0].length, y_len = board.length;
        int[][] hasbeen = new int[y_len][x_len];
        for(int i = 0; i < y_len; i++) {
            for(int j = 0; j < x_len; j++) {
                if(board[i][j] == word.charAt(0)){
                    if(cheak(board, hasbeen, y_len, x_len, 1, i, j, word)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
    
    public boolean cheak(char[][] board, int[][] hasbeen, int x_len, int y_len, int current, int x, int y, String word) {
        if(current == word.length()) {
            return true;
        }
        hasbeen[x][y] = 1;

        if (x + 1 < x_len && hasbeen[x + 1][y] == 0 && board[x + 1][y] == word.charAt(current)){
            if(cheak(board, hasbeen, x_len, y_len, current + 1, x + 1, y, word)) {
                return true;
            }
        }
        if (y + 1 < y_len && hasbeen[x][y + 1] == 0 && board[x][y + 1] == word.charAt(current)){
            if(cheak(board, hasbeen, x_len, y_len, current + 1, x, y + 1, word)) {
                return true;
            }
        }
        if (y > 0 && hasbeen[x][y - 1] == 0 && board[x][y - 1] == word.charAt(current)){
            if(cheak(board, hasbeen, x_len, y_len, current + 1, x, y - 1, word)) {
                return true;
            }
        }
        if (x > 0 && hasbeen[x - 1][y] == 0 && board[x - 1][y] == word.charAt(current)){
            if(cheak(board, hasbeen, x_len, y_len, current + 1, x - 1, y, word)) {
                return true;
            }
        }

        hasbeen[x][y] = 0;
        return false;
    }
}