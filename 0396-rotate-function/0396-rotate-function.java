class Solution {
    public int maxRotateFunction(int[] nums) {
        int len = nums.length, cur = 0, max = Integer.MIN_VALUE, sum = 0;

        for(int i = 0; i < len; i++) {
            cur += i * nums[i];
            sum += nums[i];
        }
        max = Math.max(max, cur);

        for(int i = 1; i < len; i++) {
            cur -= sum;
            cur += nums[i - 1] * len;
            max = Math.max(max, cur);
        }

        return max;
    }
}