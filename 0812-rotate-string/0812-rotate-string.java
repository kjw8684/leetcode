class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder(s);
        int len = s.length();

        for(int i = 0; i < len; i++) {
            sb.deleteCharAt(0);
            sb.append(s.charAt(i));
            
            if(sb.toString().equals(goal)) {
                return true;
            }
        }

        return false;
    }
}