class Solution {
    public int longestSubsequence(String s, int k) {
        String K = Integer.toBinaryString(k);
        int len = s.length(), answer = len, klen = K.length();
        len -= klen;

        if(len < 0) {
            return answer;
        }

        for(int i = 0; i < len; i++) {
            if(s.charAt(i) == '1') {
                answer--;
            }
        }

        int left = Integer.parseInt(s.substring(len), 2);

        return left > k ? answer - 1 : answer;
    }
}