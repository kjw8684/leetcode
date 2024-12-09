class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int len = nums.length, qlen = queries.length;
        int[] dp = new int[len];
        boolean[] answer = new boolean[qlen];

        for(int i = 1; i < len; i++) {
            if(nums[i - 1] % 2 == nums[i] % 2) {
                dp[i] = dp[i - 1] + 1;
            }
            else {
                dp[i] = dp[i - 1];
            }
        }

        for(int i = 0; i < qlen; i++) {
            if(queries[i][0] == queries[i][1]) {
                answer[i] = true;
            }
            else {
                if(dp[queries[i][0]] == dp[queries[i][1]]) {
                    answer[i] = true;
                }
                else {
                    answer[i] = false;
                }
            }
        }

        return answer;
    }
}