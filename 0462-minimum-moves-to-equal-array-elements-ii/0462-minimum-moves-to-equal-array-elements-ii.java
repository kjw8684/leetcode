class Solution {
    public int minMoves2(int[] nums) {
        int len = nums.length, lcount = 0, rcount = len;
        long min = Integer.MAX_VALUE, left = 0L, right = 0L;
        Arrays.sort(nums);

        for(int i = 0; i < len; i++) {
            right += nums[i];
        }

        for(int i = 0; i < len - 1; i++) {
            right -= nums[i];
            rcount--;
            left += nums[i];
            lcount++;
            min = Math.min(min, Math.min((long) nums[i] * lcount + right - left - (long) nums[i] * rcount, (((long) nums[i + 1] + nums[i]) / 2) * lcount + right - left - (((long) nums[i + 1] + nums[i]) / 2) * rcount));
        }

        min = Math.min(min, (long) nums[len - 1] * lcount + right - left - (long)nums[len - 1] * rcount);

        return (int)min;
    }
}