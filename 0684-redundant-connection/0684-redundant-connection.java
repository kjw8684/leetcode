class Solution {
    int[] parent, rank;
    public int[] findRedundantConnection(int[][] edges) {
        int len = edges.length;
        parent = new int[len + 1];
        rank = new int[len + 1];

        for(int i = 0; i <= len; i++) {
            parent[i] = i;
        }

        for(int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            if(find(u) == find(v)) {
                return edge;
            }
            join(u, v);
        }

        return new int[0];
    }

    public int find(int i) {
        if(parent[i] != i) {
            parent[i] = find(parent[i]);
        }
        return parent[i];
    }

    public void join(int u, int v) {
        int rootU = find(u);
        int rootV = find(v);

        if(rootU != rootV) {
            if(rank[rootU] > rank[rootV]) {
                parent[rootV] = rootU;
            }
            else if(rank[rootU] > rank[rootV]) {
                parent[rootU] = rootV;
            }
            else {
                parent[rootV] = rootU;
                rank[rootU]++;
            }
        }
    }
}