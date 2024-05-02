class Solution {
    public int findMaxK(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        
        for(int i = 0; i < len && nums[i] < 0; i++) {
            for(int j = len - 1; j >= 0 && nums[j] >= Math.abs(nums[i]); j--) {
                if(Math.abs(nums[i]) == nums[j]){
                    return nums[j];
                }
            }
        }
        
        return -1;
    }
}