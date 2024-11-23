class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int rlen = box.length, clen = box[0].length, count = 0, len = 0;
        char[][] rotated = new char[clen][rlen];

        for(int i = 0; i < rlen; i++) {
            count = 0;
            len = 0;
            for(int j = 0; j < clen; j++) {
                len++;
                if(box[i][j] == '#') {
                    count++;
                }

                if(box[i][j] == '*') {
                    fill(rotated, rlen - i - 1, j, len, count);
                    count = 0;
                    len = 0;
                }
            }
            fill(rotated, rlen - i - 1, clen, len, count);
        }

        return rotated;
    }

    public void fill(char[][] rotated, int row, int col, int len, int count) {
        if(col != rotated.length) {
            rotated[col][row] = '*';
            len--;
        }
        col--;

        for(int i = 0; i < count; i++, col--) {
            rotated[col][row] = '#';
        }

        for(int i = 0; i < len - count; i++, col--) {
            rotated[col][row] = '.';
        }
    }
}