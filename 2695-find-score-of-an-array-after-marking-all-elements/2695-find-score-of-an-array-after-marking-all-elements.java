class Solution {
    public long findScore(int[] nums) {
        int len = nums.length;
        int[][] dp = new int[len][2];

        for (int i = 0; i < len; i++) {
            dp[i][0] = nums[i];
            dp[i][1] = i;
        }

        Arrays.sort(dp, (a, b) -> a[0] - b[0]);

        boolean[] marked = new boolean[len];
        long result = 0;

        for (int[] arr : dp) {
            int val = arr[0];
            int ind = arr[1];

            if (!marked[ind]) {
                result += val;

                marked[ind] = true;
                if (ind > 0)
                    marked[ind - 1] = true;
                if (ind < len - 1) 
                    marked[ind + 1] = true;
            }
        }

        return result;
    }
}