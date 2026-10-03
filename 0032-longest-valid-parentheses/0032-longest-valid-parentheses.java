class Solution {
    public int longestValidParentheses(String s) {
        int len = s.length(), max = 0;

        for(int i = 0; i < len; i++) {
            if(max > len - i) {
                break;
            }

            int open = 0, close = 0;
            for(int j = i; j < len; j++) {
                char cur = s.charAt(j);
                if(len - j > open - close && cur == '(') {
                    open++;
                }
                else if(open > close && cur == ')'){
                    close++;
                }
                else {
                    break;
                }

                if(open == close) {
                    max = Math.max(max, open + close);
                }
            }
        }

        return max;
    }
}