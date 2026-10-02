class Solution {
    List<String> answer = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append("(");

        make(sb, 1, 0, n);

        return answer;
    }

    private void make(StringBuilder sb, int open, int close, int len) {
        if(open + close == 2 * len) {
            answer.add(sb.toString());
            return ;
        }

        if(open < len) {
            sb.append("(");
            make(sb, open + 1, close, len);
            sb.deleteCharAt(open + close);
        }

        if(open > close) {
            sb.append(")");
            make(sb, open, close + 1, len);
            sb.deleteCharAt(open + close);
        }
    }

}