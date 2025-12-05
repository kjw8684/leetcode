class Solution {
    public int countPartitions(int[] nums) {
        int len = nums.length, sum = 0, answer = 0;

        for(int num : nums) {
            sum += num;
        }

        int left = 0;
        for(int i = 0; i < len - 1; i++) {
            left += nums[i];
            sum -= nums[i];

            if((left + sum) % 2 == 0) {
                answer++;
            }
        }

        return answer;
    }
}