class Solution {
    public String reverseParentheses(String s) {
        int len = s.length(), right = 0, count = 0;
        StringBuilder sb = new StringBuilder(s);
        String temp;

        for(int i = 0; i < len; i++) {
            if(sb.charAt(i) == '(') {
                right = i + 1;
                count = 1;
                while(count != 0) {
                    char cur = sb.charAt(right);
                    if(cur == '(') {
                        count++;
                    }
                    else if(cur == ')') {
                        count--;
                    }
                    right++;
                }
                sb.replace(i, right, new StringBuilder(sb.substring(i + 1, right - 1)).reverse().toString());
                i--;
                len -= 2;
            }
            else if(sb.charAt(i) == ')') {
                right = i + 1;
                count = 1;
                while(count != 0) {
                    char cur = sb.charAt(right);
                    if(cur == ')') {
                        count++;
                    }
                    else if(cur == '(') {
                        count--;
                    }
                    right++;
                }
                sb.replace(i, right, new StringBuilder(sb.substring(i + 1, right - 1)).reverse().toString());
                i--;
                len -= 2;
            }
            System.out.println(sb.toString());
        }

        return sb.toString();
    }
}