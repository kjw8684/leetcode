class Solution {
    public int prefixCount(String[] words, String pref) {
        int len = words.length, slen = pref.length(), count = 0;

        for(int i = 0; i < len; i++) {
            if(slen <= words[i].length() && words[i].substring(0, slen).equals(pref)) {
                count++;
            }
        }

        return count;
    }
}