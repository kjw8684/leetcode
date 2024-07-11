class Solution {
    public String reverseParentheses(String s) {
        int len = s.length();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < len; i++) {
            if(s.charAt(i) == '(') {
                Pair<String, Integer> result = reverse(s, i + 1);
                sb.append(result.getKey());
                i = result.getValue();
            }
            else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

    public Pair<String, Integer> reverse(String s, int index) {
        StringBuilder sb = new StringBuilder();
        while(s.charAt(index) != ')') {
            if(s.charAt(index) == '(') {
                Pair<String, Integer> result = reverse(s, index + 1);
                sb.append(result.getKey());
                index = result.getValue();
            }
            else {
                sb.append(s.charAt(index));
            }
            index++;
        }

        return new Pair<>(sb.reverse().toString(), index);
    }
}