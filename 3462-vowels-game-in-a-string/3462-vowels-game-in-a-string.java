class Solution {
    public boolean doesAliceWin(String s) {
        int len = s.length(), count = 0;
        String vowel = "aeiou";

        for(int i = 0; i < len; i++) {
            String cur = "" + s.charAt(i);
            if(vowel.contains(cur)) {
                count++;
            }
        }

        return count != 0;
    }
}