class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        for(char order : s.toCharArray()) {
            if(order == '*') {
                int len = sb.length();
                if(len != 0) {
                    sb.delete(len - 1, len);
                }
            }
            else if(order == '#') {
                sb.append(sb.toString());
            }
            else if(order == '%') {
                sb.reverse();
            }
            else {
                sb.append(order);
            }
        }

        return sb.toString();
    }
}