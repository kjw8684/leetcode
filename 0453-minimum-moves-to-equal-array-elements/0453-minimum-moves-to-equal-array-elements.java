class Solution {
    public int minMoves(int[] nums) {
        int len = nums.length, move = 0;
        Arrays.sort(nums);
        int min = nums[0];

        for(int i = len - 1; i > 0; i--) {
            if(nums[i] == min) {
                break;
            }
            move += nums[i] - min;
        }

        return move;
    }
}