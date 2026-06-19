class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0, cur = 0;

        for(int move : gain) {
            cur += move;
            max = Math.max(max, cur);
        }

        return max;
    }
}