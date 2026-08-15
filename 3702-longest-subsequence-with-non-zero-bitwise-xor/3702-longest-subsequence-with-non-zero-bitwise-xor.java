class Solution {
    public int longestSubsequence(int[] nums) {
        int cur = 0, len = nums.length;
        boolean allzero = true;

        for(int i = 0; i < len; i++) {
            cur ^= nums[i];
            if(nums[i] != 0) {
                allzero = false;
            }
        }

        if(allzero) {
            return 0;
        }

        if(cur == 0) {
            return len - 1;
        }
        return len;
    }
}