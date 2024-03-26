import java.math.BigInteger;

class Solution {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length, answer = 0, temp = 0;
        
        for(int i = 0; i < len; i++) {
            if(nums[i] < 1 || nums[i] > len){
                nums[i] = len + 1;
            }
        }
        
        for(int i = 0; i < len; i++) {
            temp = Math.abs(nums[i]);
            if(temp > 0 && temp <= len){
                if(nums[temp - 1] > 0) {
                    nums[temp - 1] *= -1;
                }
            }
        }
        
        for(int i = 0; i < len; i++) {
            if(nums[i] > 0) {
                answer = i + 1;
                break;
            }
        }
        
        if(answer == 0){
            return len + 1;
        }
        
        return answer;
    }
}