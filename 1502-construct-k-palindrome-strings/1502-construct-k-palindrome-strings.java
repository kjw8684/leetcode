class Solution {
    public boolean canConstruct(String s, int k) {
        int len = s.length();
        if(len < k) {
            return false;
        }
        int[] alpha = new int[26];

        for(int i = 0; i < len; i++) {
            alpha[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < 26 && k >= 0; i++) {
            if(alpha[i] % 2 == 1) {
                k--;
            }
        }

        if(k >= 0) {
            return true;
        }

        return false;
    }
}