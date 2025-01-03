class Solution {
    public int waysToSplitArray(int[] nums) {
        int len = nums.length, count = 0;
        long sum = 0, cur = 0;

        for(int i = 0; i < len; i++) {
            sum += nums[i];
        }

        len--;
        for(int i = 0; i < len; i++) {
            cur += nums[i];
            sum -= nums[i];

            if(cur >= sum) {
                count++;
            }
        }

        return count;
    }
}