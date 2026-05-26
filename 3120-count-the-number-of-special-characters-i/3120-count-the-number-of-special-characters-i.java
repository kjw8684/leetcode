class Solution {
    public int numberOfSpecialChars(String word) {
        int len = word.length(), count = 0;
        boolean[] lowAlpha = new boolean[26];
        boolean[] upperAlpha = new boolean[26];

        for(int i = 0; i < len; i++) {
            char cur = word.charAt(i);
            if('a' <= cur && cur <= 'z') {
                lowAlpha[cur - 'a'] = true;
            }

            if('A' <= cur && cur <= 'Z') {
                upperAlpha[cur - 'A'] = true;
            }
        }

        for(int i = 0; i < 26; i++) {
            if(lowAlpha[i] && upperAlpha[i]) {
                count++;
            }
        }

        return count;
    }
}