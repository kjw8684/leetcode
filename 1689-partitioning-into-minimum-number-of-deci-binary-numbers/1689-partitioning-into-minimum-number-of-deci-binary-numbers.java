class Solution {
    public int minPartitions(String n) {
        int len = n.length(), max = 0;

        for(int i = 0; i < len; i++) {
            int cur = n.charAt(i) - '0';

            max = Math.max(max, cur);
        }

        return max;
    }
}