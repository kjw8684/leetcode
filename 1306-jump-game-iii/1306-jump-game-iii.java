class Solution {
    public boolean canReach(int[] arr, int start) {
        int len = arr.length;
        boolean[] visited = new boolean[len];
        visited[start] = true;

        return check(arr, visited, start, len);
    }

    public boolean check(int[] arr, boolean[] visited, int cur, int len) {
        if(arr[cur] == 0) {
            return true;
        }
        boolean current = false;

        if(cur + arr[cur] < len && !visited[cur + arr[cur]]) {
            visited[cur + arr[cur]] = true;
            current |= check(arr, visited, cur + arr[cur], len);
            visited[cur + arr[cur]] = false;
        }

        if(cur - arr[cur] >= 0 && !visited[cur - arr[cur]]) {
            visited[cur - arr[cur]] = true;
            current |= check(arr, visited, cur - arr[cur], len);
            visited[cur - arr[cur]] = false;
        }

        return current;
    }
}