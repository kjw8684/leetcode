class Solution {
    public boolean isValid(String word) {
        int len = word.length();
        if(len < 3) {
            return false;
        }

        boolean vowel = false, consonant = false;

        for(int i = 0; i < len; i++) {
            char cur = word.charAt(i);
            if(cur == 65 || cur == 69 || cur == 73 || cur == 79 || cur == 85 || cur == 97 || cur == 101 || cur == 105 || cur == 111 || cur == 117) {
                vowel = true;
            }
            else if((cur > 65 && cur < 91) || (cur > 97 && cur < 123)) {
                consonant = true;
            }
            else if(cur <= 47 || cur >= 58) {
                return false;
            }
        }

        return vowel && consonant;
    }
}