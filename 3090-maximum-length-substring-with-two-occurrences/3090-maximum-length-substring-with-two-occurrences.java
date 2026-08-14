class Solution {
    public int maximumLengthSubstring(String s) {
        int[] alpha = new int[26];
        int left = 0, max = 0, len = s.length();

        for(int i = 0; i < len; i++) {
            int cur = s.charAt(i) - 'a';
            alpha[cur]++;

            while(alpha[cur] > 2) {
                alpha[s.charAt(left) - 'a']--;
                left++;
            }

            max = Math.max(max, i - left + 1);
        }

        return max;
    }
}