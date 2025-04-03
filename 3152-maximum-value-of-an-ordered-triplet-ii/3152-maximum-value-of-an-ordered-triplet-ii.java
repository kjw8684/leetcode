class Solution {
    public long maximumTripletValue(int[] nums) {
        int len = nums.length, max = nums[0];
        int[] maxarr = new int[len];
        long answer = 0;
        maxarr[0] = 0;

        for(int i = 1; i < len; i++) {
            maxarr[i] = Math.max(maxarr[i - 1], max - nums[i]);
            max = Math.max(max, nums[i]);
        }
        
        for(int cur : maxarr) {
            System.out.println(cur);
        }

        for(int i = 2; i < len; i++) {
            answer = Math.max(answer, (long)maxarr[i - 1] * nums[i]);
        }

        return answer;
    }
}