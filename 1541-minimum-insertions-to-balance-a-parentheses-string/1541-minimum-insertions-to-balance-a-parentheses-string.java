class Solution {
    public int minInsertions(String s) {
        int len = s.length(), count = 0, change = 0;
        StringBuilder sb = new StringBuilder();
        boolean close = false;

        for(int i = 0; i < len; i++) {
            char cur = s.charAt(i);
            if(cur == '(' && !close) {
                sb.append("(");
            }
            else if(cur == '(' && close) {
                sb.append(")");
                sb.append("(");
                close = false;
            }
            else if(cur == ')' && close) {
                sb.append("]");
                close = false;
            }
            else {
                close = true;
            }
        }
        if(close) {
            sb.append(")");
        }

        len = sb.length();

        for(int i = 0; i < len; i++) {
            char cur = sb.charAt(i);
            System.out.println(cur);
            if(cur == '(') {
                count++;
            }
            else if(cur == ']' && count > 0) {
                count--;
            }
            else if(cur == ']') {
                change++;
            }
            else if(count > 0){
                count--;
                change++;
            }
            else {
                change += 2;
            }
        }

        return change + (count * 2);
    }
}