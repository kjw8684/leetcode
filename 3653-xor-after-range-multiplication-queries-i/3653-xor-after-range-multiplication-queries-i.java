class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int MOD = 1000000007, len = queries.length, answer = 0;

        for(int i = 0; i < len; i++) {
            for(int j = queries[i][0]; j <= queries[i][1]; j += queries[i][2]) {
                nums[j] = Long.valueOf(((long)nums[j] * queries[i][3]) % MOD).intValue();
            }
        }

        for(int num : nums) {
            answer ^= num;
        }

        return answer;
    }
}