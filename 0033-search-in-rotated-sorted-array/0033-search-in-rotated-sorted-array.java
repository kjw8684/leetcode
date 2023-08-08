class Solution {
    public int search(int[] nums, int target) {
        int k = nums.length - 1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i + 1]){
                k = i;
                break;
            }
        }
        if(nums[0] <= target){
            for(int i = 0; i < k + 1; i++){
                if(nums[i] == target){
                    return i;
                }
            }
            return -1;
        }
        else if(k == nums.length - 1){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == target){
                    return i;
                }
            }
            return -1;
        }     
        else{
            for(int i = k; i < nums.length; i++){
                if(nums[i] == target){
                    return i;
                }
            }
            return -1;
        }
    }
}