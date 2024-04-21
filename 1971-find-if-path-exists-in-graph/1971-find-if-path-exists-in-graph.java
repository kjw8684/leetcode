class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        int len = edges.length;
        if(len == 0){
            return true;   
        }
        boolean[] visited = new boolean[n];
        boolean flag = true;
        visited[source] = true;

        while(flag){
            flag = false;
            for(int i = 0; i < len; i++){
                if(visited[edges[i][0]] != visited[edges[i][1]]){
                    visited[edges[i][0]] = true;
                    visited[edges[i][1]] = true;
                    flag = true;
                }
                if(visited[destination]) return true;
            }
        }
        return false;
    }
}