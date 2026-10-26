class Solution {
    public int countIslands(int[][] grid, int k) {
        int row = grid.length, col = grid[0].length, count = 0;

        boolean[][] visited = new boolean[row][col];
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] != 0 && !visited[i][j]) {
                    long sum = grid[i][j];
                    Deque<int[]> stack = new ArrayDeque<>();
                    stack.push(new int[]{i, j});
                    visited[i][j] = true;

                    while (!stack.isEmpty()) {
                        int[] cur = stack.pop();
                        int r = cur[0];
                        int c = cur[1];

                        for (int d = 0; d < 4; d++) {
                            int nr = r + dr[d];
                            int nc = c + dc[d];

                            if (nr >= 0 && nr < row &&
                                nc >= 0 && nc < col &&
                                grid[nr][nc] != 0 &&
                                !visited[nr][nc]) {
                                sum += grid[nr][nc];
                                visited[nr][nc] = true;
                                stack.push(new int[]{nr, nc});
                            }
                        }
                    }

                    if (sum % k == 0) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}