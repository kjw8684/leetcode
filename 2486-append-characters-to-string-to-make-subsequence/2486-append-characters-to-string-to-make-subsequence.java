class Solution {
    public int appendCharacters(String s, String t) {
        int slen = s.length(), tlen = t.length(), current = 0;
        
        for(int i = 0; i < slen; i++) {
            if(s.charAt(i) == t.charAt(current)) {
                current++;
            }
            if(tlen == current) {
                break;
            }
        }
        
        return tlen - current;
    }
}