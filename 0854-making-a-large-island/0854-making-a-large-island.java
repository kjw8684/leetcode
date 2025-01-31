class Solution {
    int len;
    Map<Integer, Integer> map = new HashMap<>();
    public int largestIsland(int[][] grid) {
        len = grid.length;
        int max = 0, currentId = 2;
        int[][] id = new int[len][len];

        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(grid[i][j] != 0 && id[i][j] == 0) {
                    map.put(currentId, 0);
                    DFS(grid, id, i, j, currentId);
                    currentId++;
                }
            }
        }

        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(grid[i][j] == 0) {
                    max = Math.max(max, sum(grid, id, i, j));
                }
            }
        }
        
        if(max == 0) {
            if(map.size() != 0) {
                return map.get(currentId - 1);
            }
            else {
                return 1;
            }
        }

        return max;
    }

    public void DFS(int[][] grid, int[][] id, int i, int j, int currentId) {
        map.compute(currentId, (key, value) -> value + 1);
        id[i][j] = currentId;

        if(i < len - 1 && grid[i + 1][j] != 0 && id[i + 1][j] == 0) {
            DFS(grid, id, i + 1, j, currentId);
        }
        if(j < len - 1 && grid[i][j + 1] != 0 && id[i][j + 1] == 0) {
            DFS(grid, id, i, j + 1, currentId);
        }
        if(i > 0 && grid[i - 1][j] != 0 && id[i - 1][j] == 0) {
            DFS(grid, id, i - 1, j, currentId);
        }
        if(j > 0 && grid[i][j - 1] != 0 && id[i][j - 1] == 0) {
            DFS(grid, id, i, j - 1, currentId);
        }
    }

    public int sum(int[][] grid, int[][] id, int i, int j) {
        int sum = 1;
        int[] visited = new int[3];

        if(i < len - 1 && id[i + 1][j] != 0) {
            visited[0] = id[i + 1][j];
            sum += map.get(id[i + 1][j]);
        }
        if(j < len - 1 && id[i][j + 1] != 0 && visited[0] != id[i][j + 1]) {
            visited[1] = id[i][j + 1];
            sum += map.get(id[i][j + 1]);
        }
        if(i > 0 && id[i - 1][j] != 0 && visited[0] != id[i - 1][j] && visited[1] != id[i - 1][j]) {
            visited[2] = id[i - 1][j];
            sum += map.get(id[i - 1][j]);
        }
        if(j > 0 && id[i][j - 1] != 0 && visited[0] != id[i][j - 1] && visited[1] != id[i][j - 1] && visited[2] != id[i][j - 1]) {
            sum += map.get(id[i][j - 1]);
        }

        return sum;
    }
}