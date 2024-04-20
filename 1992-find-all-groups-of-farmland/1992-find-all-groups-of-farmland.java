class Solution {
    public int[][] findFarmland(int[][] land) {
        Queue<int[]> queue = new LinkedList<>();
        int x_len = land.length, y_len = land[0].length, answer = 0;
        for(int i = 0; i < x_len; i++) {
            for(int j = 0; j < y_len; j++) {
                if(land[i][j] == 1) {
                    queue.offer(create(land, i, j, x_len, y_len));
                    answer++;
                }
            }
        }
        int[][] coordinate = new int[answer][4];
        for(int i = 0; i < answer; i++) {
            coordinate[i] = queue.poll();
        }
        
        return coordinate;
    }
    
    public int[] create(int[][] land, int x, int y, int x_len, int y_len) {
        int[] current = {x, y, x, y};
        banish(land, x, y, x_len, y_len, current);
        
        return current;
    }
    
    public void banish(int[][] land, int x, int y, int x_len, int y_len, int[] current) {
        land[x][y] = 0;
        if(current[2] < x) {
            current[2] = x;
        }
        if(current[3] < y) {
            current[3] = y;
        }
        if(x < x_len - 1 && land[x + 1][y] == 1) {
            banish(land, x + 1, y, x_len, y_len, current);
        }

        if(y < y_len - 1 && land[x][y + 1] == 1) {
            banish(land, x, y + 1, x_len, y_len, current);
        }
    }
}