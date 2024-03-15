class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] answer = new int[len], left = new int[len], right = new int[len];
        left[0] = 1;
        right[len - 1] = 1;
        
        for(int i = 1; i < len; i++) {
            left[i] = nums[i - 1] * left[i - 1];
            right[len - i - 1] = nums[len - i] * right[len - i];
        }
        
        for(int i = 0; i < len; i++) {
            answer[i] = left[i] * right[i];
        }
            
        return answer;
    }
}