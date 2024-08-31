class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        double[] map = new double[n];
        int len = edges.length;
        boolean cheak = false;
        map[start_node] = 1.0;

        for(int i = 0; i < n; i++) {
            cheak = false;
            for(int j = 0; j < len; j++) {
                if(map[edges[j][0]] < map[edges[j][1]] * succProb[j]) {
                    map[edges[j][0]] = map[edges[j][1]] * succProb[j];
                    cheak = true;
                }
                if(map[edges[j][1]] < map[edges[j][0]] * succProb[j]) {
                    map[edges[j][1]] = map[edges[j][0]] * succProb[j];
                    cheak = true;
                }
            }
            if(!cheak) {
                break;
            }
        }

        return map[end_node];
    }
}