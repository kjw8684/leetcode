class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int size = rows * cols, current = 0, step = 1, count = 0;
        int[][] answer = new int[size][2];
        
        while(current < size) {
            for(int j = 0; j < 2 && current < size; j++) {
                for(int i = 0; i < step && current < size; i++) {
                    if(rStart < rows && cStart < cols && 0 <= rStart && 0 <= cStart) {
                        answer[current][0] = rStart;
                        answer[current][1] = cStart;
                        current++;
                    }

                    if(count % 4 == 0) {
                        cStart++;
                    }
                    else if(count % 4 == 1) {
                        rStart++;
                    }
                    else if(count % 4 == 2) {
                        cStart--;
                    }
                    else {
                        rStart--;
                    }
                }
                count++;
            }
            step++;
        }

        return answer;
    }
}