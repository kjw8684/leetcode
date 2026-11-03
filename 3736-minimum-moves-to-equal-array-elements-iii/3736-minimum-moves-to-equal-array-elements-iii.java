class Solution {
    public int minMoves(int[] nums) {
        int max = 0, move = 0;

        for(int num : nums) {
            max = Math.max(max, num);
        }

        for(int num : nums) {
            move += max - num;
        }

        return move;
    }
}