class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int len = nums.length, left_pointer = 0, rigth_pointer = 0, sum = 0, answer = 0, left_zero = 1, rigth_zero = 1;
        
        if(goal == 0) {
            for(int i = 0; i < len; i++) {
                if(nums[i] == 0) {
                    left_pointer++;
                    answer += left_pointer;
                    continue;
                }
                left_pointer = 0;
            }
            return answer;
        }
        
        
        while(rigth_pointer < len && left_pointer < len) {
            if(nums[left_pointer] == 0) {
                left_pointer++;
                left_zero++;
                continue;
            }
            
            if(rigth_pointer < left_pointer) {
                rigth_pointer = left_pointer;
            }
            
            if(sum != goal){
                if(nums[rigth_pointer] == 1){
                    sum++;
                }
                rigth_pointer++;
                continue;
            }
            
            if(sum == goal && nums[rigth_pointer] == 0) {
                rigth_zero++;
                rigth_pointer++;
                continue;
            }
            
            if(sum == goal) {
                left_pointer++;
                sum--;
                answer += left_zero * rigth_zero;
                left_zero = 1;
                rigth_zero = 1;
            }
        }
        
        if(sum == goal){
            answer += left_zero * rigth_zero;
        }
        
        return answer;
    }
}