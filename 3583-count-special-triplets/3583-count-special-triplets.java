class Solution {
    public int specialTriplets(int[] nums) {
        int len = nums.length;
        long count = 0L;
        long[][] dp = new long[len][2];

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = len - 1; i >= 0; i--) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(nums[i] == 0) {
                dp[i][1] = map.get(0) - 1;
            }
            else {
                dp[i][1] = map.getOrDefault(nums[i] * 2, 0);
            }
        }

        map.clear();
        for(int i = 0; i < len; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(nums[i] == 0) {
                dp[i][0] = map.get(0) - 1;
            }
            else {
                dp[i][0] = map.getOrDefault(nums[i] * 2, 0);
            }
        }

        for(int i = 0; i < len; i++) {
            count += dp[i][0] * dp[i][1];
            count %= 1000000007;
        }

        return (int)count;
    }
}