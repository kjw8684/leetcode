class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int max = (int)Math.pow(2, maximumBit) - 1, len = nums.length, xor = nums[0];
        int[] answer = new int[len];

        for(int i = 1; i < len; i++) {
            xor ^= nums[i];
        }

        max = (max | xor) ^ xor;
        answer[0] = max;

        for(int i = 1; i < len; i++) {
            max = answer[i - 1] ^ nums[len - i];
            answer[i] = max;
        }

        return answer;
    }
}