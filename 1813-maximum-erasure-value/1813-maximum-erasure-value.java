class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int len = nums.length, leftPointer = 0, rightPointer = 0, max = 0;
        int[] dp = new int[len];
        dp[0] = nums[0];

        for(int i = 1; i < len; i++) {
            dp[i] += nums[i] + dp[i - 1];
        }

        Set<Integer> set = new HashSet<>();
        int left = 0;
        while(rightPointer < len) {
            while(!set.contains(nums[rightPointer])) {
                set.add(nums[rightPointer]);
                rightPointer++;
                if(rightPointer == len) {
                    break;
                }
            }
            max = Math.max(max, dp[rightPointer - 1] - left);
            if(rightPointer == len) {
                break;
            }

            while(set.contains(nums[rightPointer])) {
                set.remove(nums[leftPointer]);
                leftPointer++;
            }
            left = dp[leftPointer - 1];
        }

        return max;
    }
}