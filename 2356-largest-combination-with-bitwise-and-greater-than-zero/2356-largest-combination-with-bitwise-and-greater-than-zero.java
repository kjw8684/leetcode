class Solution {
    public int largestCombination(int[] candidates) {
        int max = 0, len = candidates.length, index = 0;
        int[] bit_sum = new int[30];

        for(int i = 0; i < len; i++) {
            index = 0;
            while(candidates[i] != 0) {
                if((candidates[i] & 1) == 1) {
                    bit_sum[index]++;
                }
                candidates[i] >>= 1;
                index++;
            }
        }

        for(int i = 0; i < 30; i++) {
            max = Math.max(max, bit_sum[i]);
        }

        return max;
    }
}