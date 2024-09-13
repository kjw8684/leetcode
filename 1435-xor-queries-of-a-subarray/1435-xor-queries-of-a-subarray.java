class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int len = queries.length, cur = 0;
        int[] answer = new int[len];

        for(int i = 0; i < len; i++) {
            cur = 0;
            for(int j = queries[i][0]; j <= queries[i][1]; j++) {
                cur ^= arr[j];
            }
            answer[i] = cur;
        }

        return answer;
    }
}