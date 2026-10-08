class Solution {
    public String removeOuterParentheses(String s) {
        int len = s.length(), depth = 0;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < len; i++) {
            if(s.charAt(i) == '(') {
                depth++;
                if(depth != 1) {
                    sb.append("(");
                }
            }
            else {
                depth--;
                if(depth != 0) {
                    sb.append(")");
                }
            }
        }

        return sb.toString();
    }
}