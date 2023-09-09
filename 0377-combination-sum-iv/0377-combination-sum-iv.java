class Solution {
    int count = 0;
    public int combinationSum4(int[] nums, int target) {
        int[] counting = new int[target + 1];
        counting[0] = 1;
        for(int i = 1; i < target + 1; i++){
            for(int j = 0; j < nums.length; j++){
                if(i - nums[j] >= 0){
                    counting[i] += counting[i - nums[j]];
                }
            }
        }
        return counting[target];
    }
}