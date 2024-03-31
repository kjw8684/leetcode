class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long answer = 0;
        int len = nums.length, left = -1, right = -1, bad = -1, current = -1;
        
        for(int i = 0; i < len; i++) {
            if(nums[i] < minK || nums[i] > maxK){
                bad = i;
            }
            
            if(nums[i] == minK){
                left = i;
            }
            
            if(nums[i] == maxK){
                right = i;
            }
            
            current = Math.min(left, right) - bad;
            
            if(current > 0) {
                answer += current;
            }
        }
        
        return answer;
    }
}