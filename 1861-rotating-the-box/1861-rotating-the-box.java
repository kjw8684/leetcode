class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int col = boxGrid.length, row = boxGrid[0].length;
        char[][] answer = new char[row][col];
        int[][] rotated = new int[row][col];

        for(int i = 0; i < col; i++) {
            int count = 0;
            for(int j = 0; j < row; j++) {
                if(boxGrid[i][j] == '#') {
                    count++;
                }
                if(boxGrid[i][j] == '*') {
                    if(j != 0 && rotated[j - 1][col - i - 1] != -1) {
                        rotated[j - 1][col - i - 1] = count;
                    }
                    rotated[j][col - i - 1] = -1;
                    count = 0;
                }
            }

            if(rotated[row - 1][col - i - 1] != -1) {
                rotated[row - 1][col - i - 1] = count;
            }
        }

        for(int i = 0; i < col; i++) {
            int count = 0;
            for(int j = row - 1; j >= 0; j--) {
                if(rotated[j][i] > 0) {
                    count = rotated[j][i];
                }
                if(rotated[j][i] == -1) {
                    answer[j][i] = '*';
                }
                else if(count > 0){
                    answer[j][i] = '#';
                    count--;
                }
                else {
                    answer[j][i] = '.';
                }
            }
        }

        return answer;
    }
}