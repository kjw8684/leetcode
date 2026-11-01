class Solution {
    public int minMoves(int[] nums) {
        int len = nums.length, move = 0, min = 1000000000;
        for(int i = 0; i < len; i++) {
            min = Math.min(min, nums[i]);
        }

        for(int i = 0; i < len; i++) {
            if(nums[i] != min) {
                move += nums[i] - min;
            }
        }

        return move;
    }
}