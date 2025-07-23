class Solution {
    public int maximumGain(String s, int x, int y) {
        Stack<Character> stack = new Stack<>();
        int score = 0, len = s.length();
        stack.push(s.charAt(0));

        if(x > y) {
            for(int i = 1; i < len; i++) {
                char cur = s.charAt(i);
                if(!stack.isEmpty() && cur == 'b' && stack.peek() == 'a') {
                    stack.pop();
                    score += x;
                }
                else {
                    stack.push(cur);
                }
            }

            if(stack.isEmpty()) {
                return score;
            }

            Stack<Character> stack2 = new Stack<>();
            stack2.push(stack.pop());
            while(!stack.isEmpty()) {
                char cur = stack.pop();
                if(!stack2.isEmpty() && cur == 'b' && stack2.peek() == 'a') {
                    stack2.pop();
                    score += y;
                }
                else {
                    stack2.push(cur);
                }
            }
        }
        else {
            for(int i = 1; i < len; i++) {
                char cur = s.charAt(i);
                if(!stack.isEmpty() && cur == 'a' && stack.peek() == 'b') {
                    stack.pop();
                    score += y;
                }
                else {
                    stack.push(cur);
                }
            }

            if(stack.isEmpty()) {
                return score;
            }

            Stack<Character> stack2 = new Stack<>();
            stack2.push(stack.pop());
            while(!stack.isEmpty()) {
                char cur = stack.pop();
                if(!stack2.isEmpty() && cur == 'a' && stack2.peek() == 'b') {
                    stack2.pop();
                    score += x;
                }
                else {
                    stack2.push(cur);
                }
            }
        }

        return score;
    }
}