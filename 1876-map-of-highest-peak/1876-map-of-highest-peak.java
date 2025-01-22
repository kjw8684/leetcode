class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int rowLen = isWater.length, colLen = isWater[0].length;
        int[][] answer = new int[rowLen][colLen];

        Queue<int[]> queue = new LinkedList<>();

        for(int i = 0; i < rowLen; i++) {
            for(int j = 0; j < colLen; j++) {
                if(isWater[i][j] == 1) {
                    queue.add(new int[]{i, j});
                }
                else {
                    answer[i][j] = -1;
                }
            }
        }

        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        while(!queue.isEmpty()) {
            int[] array = queue.poll();
            int row = array[0], col = array[1];
            
            for(int[] dir : directions) {
                int nrow = row + dir[0], ncol = col + dir[1];

                if(nrow >= 0 && nrow < rowLen && ncol >= 0 && ncol < colLen && answer[nrow][ncol] == -1) {
                    answer[nrow][ncol] = answer[row][col] + 1;
                    queue.add(new int[]{nrow, ncol});
                }
            }
        }

        return answer;
    }
}