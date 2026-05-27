class Solution {
    public int numberOfSpecialChars(String word) {
        int len = word.length();
        int[] alpha = new int[26];

        for(int i = 0; i < len; i++) {
            char cur = word.charAt(i);
            if(cur >= 'a' && cur <= 'z') {
                if(alpha[cur - 'a'] == 2) {
                    alpha[cur - 'a'] = -1;
                }
                if(alpha[cur - 'a'] == 0) {
                    alpha[cur - 'a'] = 1;
                }
            }
            else {
                if(alpha[cur - 'A'] == 1) {
                    alpha[cur - 'A'] = 2;
                }
                if(alpha[cur - 'A'] == 0) {
                    alpha[cur - 'A'] = -1;
                }
            }
        }

        int count = 0;

        for(int i = 0; i < 26; i++) {
            if(alpha[i] == 2) {
                count++;
            }
        }

        return count;
    }
}