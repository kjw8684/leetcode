class Solution {
    public String removeOuterParentheses(String s) {
        int len = s.length(), depth = 0, count = 0;
        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i < len; i++) {
            if(s.charAt(i) == '(') {
                depth++;
                if(depth == 1) {
                    sb.deleteCharAt(i - count);
                    count++;
                }
            }
            else {
                depth--;
                if(depth == 0) {
                    sb.deleteCharAt(i - count);
                    count++;
                }
            }
        }

        return sb.toString();
    }
}