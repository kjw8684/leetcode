class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int len = nums.length, answer = 0, sum = 1, current = 0;
        for(int i = 0; i < len; i++) {
            sum = 1;
            current = i;
            while(current < len) {
                sum *= nums[current];
                if(sum >= k) {
                    break;
                }
                
                answer++;
                current++;
            }
        }
        
        return answer;
    }
}