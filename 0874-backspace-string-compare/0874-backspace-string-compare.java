class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb_s = new StringBuilder(), sb_t = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '#') {
                if (sb_s.length() != 0) {
                    sb_s.deleteCharAt(sb_s.length() - 1);
                }
            }else {
                sb_s.append(s.charAt(i));
            }
        }
        s = sb_s.toString();

        for (int i = 0; i < t.length(); i++) {
            if(t.charAt(i) == '#') {
                if (sb_t.length() != 0) {
                    sb_t.deleteCharAt(sb_t.length() - 1);
                }
            }else {
                sb_t.append(t.charAt(i));
            }
        }
        t = sb_t.toString();

        return s.equals(t);
    }
}