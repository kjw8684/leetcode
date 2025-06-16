class Solution {
    public int maximumDifference(int[] nums) {
        int answer = 0, len = nums.length, min = nums[0], temp = nums[0];

        for(int i = 1; i < len; i++) {
            min = temp;
            if(answer < nums[i] - min) {
                answer = nums[i] - min;
            }
            
            if(nums[i] < min) {
                temp = nums[i];
            }
        }

        return answer == 0 ? -1 : answer;
    }
}