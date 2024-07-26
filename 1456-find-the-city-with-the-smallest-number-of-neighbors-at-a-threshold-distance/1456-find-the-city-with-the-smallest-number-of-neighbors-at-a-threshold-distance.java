class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] map = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i != j) {
                    map[i][j] = 100000;
                }
            }
        }
        int answer = 0, minSize = n, len = edges.length, current = 0;

        for(int i = 0; i < len; i++) {
            map[edges[i][0]][edges[i][1]] = Math.min(map[edges[i][0]][edges[i][1]], edges[i][2]);
            map[edges[i][1]][edges[i][0]] = Math.min(map[edges[i][1]][edges[i][0]], edges[i][2]);
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < n; k++) {
                    if (map[j][i] + map[i][k] < map[j][k]) {
                        map[j][k] = map[j][i] + map[i][k];
                    }
                }
            }
        }

        for(int i = 0; i < n; i++) {
            current = 0;
            for(int j = 0; j < n; j++) {
                if(map[i][j] <= distanceThreshold) {
                    current++;
                }
            }
            if(current <= minSize) {
                answer = i;
                minSize = current;
            }
        }

        return answer;
    }
}