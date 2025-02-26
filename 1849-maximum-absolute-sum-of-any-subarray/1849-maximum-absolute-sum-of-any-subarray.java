class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int len = nums.length;
        long min = nums[0], max = nums[0], absMax = nums[0];
        long[] dpsum = new long[len];
        dpsum[0] = nums[0];

        for(int i = 1; i < len; i++) {
            dpsum[i] = dpsum[i - 1] + nums[i];

            if(dpsum[i] - min > absMax) {
                absMax = dpsum[i] - min;
            }
            if(max - dpsum[i] > absMax) {
                absMax = max - dpsum[i];
            }

            if(min > dpsum[i]) {
                min = dpsum[i];
            }
            if(max < dpsum[i]) {
                max = dpsum[i];
            }
        }

        if(-1 * min > absMax){
            absMax = -1 * min;
        }

        if(max > absMax) {
            absMax = max;
        }

        return (int)absMax;
    }
}