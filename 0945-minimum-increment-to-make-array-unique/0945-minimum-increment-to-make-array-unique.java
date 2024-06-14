class Solution {
    public int minIncrementForUnique(int[] nums) {
        int len = nums.length, answer = 0;
        Arrays.sort(nums);
        
        for(int i = 1; i < len; i++) {
            while(nums[i - 1] >= nums[i]) {
                answer++;
                nums[i]++;
            }
        }
        
        return answer;
    }
}