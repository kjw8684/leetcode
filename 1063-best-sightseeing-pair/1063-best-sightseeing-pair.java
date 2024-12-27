class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max = Integer.MIN_VALUE, len = values.length, temp = values[0];

        for(int i = 1; i < len; i++) {
            if(values[i] - i + temp > max) {
                max = values[i] - i + temp;
            }

            if(values[i] + i > temp) {
                temp = values[i] + i;
            }
        }

        return max;
    }
}