class Solution {
    public int[] leftRightDifference(int[] nums) {
        int len = nums.length, sum = 0, cur = 0;
        int[] answer = new int[len];

        for(int num : nums) {
            sum += num;
        }

        for(int i = 0; i < len; i++) {
            sum -= nums[i];
            answer[i] = Math.abs(sum - cur);
            cur += nums[i];
        }

        return answer;
    }
}