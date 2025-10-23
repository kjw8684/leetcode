class Solution {
    public boolean hasSameDigits(String s) {
        
        while(s.length() != 2) {
            StringBuilder sb = new StringBuilder();
            int len = s.length();

            for(int i = 1; i < len; i++) {
                int cur = ((s.charAt(i - 1) - '0') + (s.charAt(i) - '0')) % 10;
                sb.append(cur);
            }

            s = sb.toString();
        }

        return s.charAt(0) == s.charAt(1);
    }
}