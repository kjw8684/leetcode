class Solution {
    public int reverseDegree(String s) {
        int sum = 0, len = s.length();

        for(int i = 0; i < len; i++) {
            int cur = s.charAt(i) - 'a';

            sum += (26 - cur) * (i + 1);
        }

        return sum;
    }
}