import java.util.*;

class Solution {
    public int closedIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;

        boolean[][] visited = new boolean[row][col];
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 0 && !visited[i][j]) {
                    boolean closed = true;
                    Deque<int[]> stack = new ArrayDeque<>();
                    stack.push(new int[]{i, j});
                    visited[i][j] = true;

                    while (!stack.isEmpty()) {
                        int[] cur = stack.pop();
                        int r = cur[0];
                        int c = cur[1];

                        if (r == 0 || r == row - 1 ||
                            c == 0 || c == col - 1) {
                            closed = false;
                        }

                        for (int d = 0; d < 4; d++) {
                            int nr = r + dr[d];
                            int nc = c + dc[d];

                            if (nr >= 0 && nr < row &&
                                nc >= 0 && nc < col &&
                                grid[nr][nc] == 0 &&
                                !visited[nr][nc]) {

                                visited[nr][nc] = true;
                                stack.push(new int[]{nr, nc});
                            }
                        }
                    }

                    if (closed) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}