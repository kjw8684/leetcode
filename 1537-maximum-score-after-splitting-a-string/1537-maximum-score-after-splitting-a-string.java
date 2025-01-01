class Solution {
    public int maxScore(String s) {
        int right = 0, left = 0, max = 0, len = s.length();

        for(int i = 0; i < len; i++) {
            if(s.charAt(i) == '1') {
                left++;
            }
        }

        len--;
        for(int i = 0; i < len; i++) {
            if(s.charAt(i) == '0') {
                right++;
            }
            else {
                left--;
            }

            max = Math.max(max, right + left);
        }

        return max;
    }
}