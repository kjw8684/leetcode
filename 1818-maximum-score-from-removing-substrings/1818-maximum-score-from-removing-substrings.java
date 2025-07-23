class Solution {
    public int maximumGain(String s, int x, int y) {
        Stack<Character> stack = new Stack<>();
        int score = 0, len = s.length(), big = y, small = x;
        char bigchar = 'a', smallchar = 'b';
        stack.push(s.charAt(0));

        if(x > y) {
            big = x;
            small = y;
            bigchar = 'b';
            smallchar = 'a';
        }


        for(int i = 1; i < len; i++) {
            char cur = s.charAt(i);
            if(!stack.isEmpty() && cur == bigchar && stack.peek() == smallchar) {
                stack.pop();
                score += big;
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
            if(!stack2.isEmpty() && cur == bigchar && stack2.peek() == smallchar) {
                stack2.pop();
                score += small;
            }
            else {
                stack2.push(cur);
            }
        }

        return score;
    }
}