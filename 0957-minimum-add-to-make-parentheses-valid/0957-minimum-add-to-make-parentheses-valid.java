class Solution {
    public int minAddToMakeValid(String s) {
        int len = s.length();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < len; i++) {
            if(s.charAt(i) == ')') {
                if(!stack.isEmpty() && stack.peek() == 0) {
                    stack.pop();
                }
                else {
                    stack.push(1);
                }
            }
            else {
                stack.push(0);
            }
        }

        return stack.size();
    }
}