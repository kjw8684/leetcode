class Solution {
    public long maxAlternatingSum(int[] nums) {
        int len = nums.length;

        for(int i = 0; i < len; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);

        long answer = 0L;

        for(int i = 0; i < len / 2; i++) {
            answer -= nums[i];
        }
        for(int i = len / 2; i < len; i++) {
            answer += nums[i];
        }

        return answer;
    }
}