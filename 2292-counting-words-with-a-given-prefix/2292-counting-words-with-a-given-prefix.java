class Solution {
    public int prefixCount(String[] words, String pref) {
        int len = words.length, slen = pref.length(), count = 0;

        for(int i = 0; i < len; i++) {
            if(words[i].startWith(pref)) {
                count++;
            }
        }

        return count;
    }
}