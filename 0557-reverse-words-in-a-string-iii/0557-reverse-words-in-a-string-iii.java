class Solution {
    public String reverseWords(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            boolean is_blank = s.charAt(i) != ' ';
            if (is_blank) {
                stack.push(s.charAt(i)); 
            }else {
                while (!stack.empty()) {
                    answer.append(stack.pop());
                }
                answer.append(" ");
            }
        }
        while (!stack.empty()) {
            answer.append(stack.pop());
        }
        return answer.toString();
    }
}