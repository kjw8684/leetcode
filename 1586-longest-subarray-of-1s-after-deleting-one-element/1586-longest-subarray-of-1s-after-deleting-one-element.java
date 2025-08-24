class Solution {
    public int longestSubarray(int[] nums) {
        int res = 0, zeros = 0, n = nums.length;
        for (int l = 0, r = 0; r < n; r++){
            zeros += (nums[r] ^ 1);
            while (zeros > 1)
                zeros -= (nums[l++] ^ 1);
            res = Math.max(res, r - l);
        }
        return res;
    }
}