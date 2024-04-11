class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder sb = new StringBuilder(num) ,answer = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int same = 0;
        
        for(int i = 0; i < sb.length(); i++) {
            if(i == 0 && sb.charAt(i) == '0') {
                sb.deleteCharAt(i);
                i--;
                continue;
            }
            if(sb.charAt(i) == '0' && i <= k) {
                sb.delete(0, i);
                k -= i;
                i = -1;
                continue;
            }
        }
        
        for(int i = 0; i < sb.length(); i++) {
            if(k == 0) {
                stack.push(sb.charAt(i));
            }
            else if(stack.isEmpty()) {
                stack.push(sb.charAt(i));
            }
            else if(stack.peek() == sb.charAt(i)) {
                stack.push(sb.charAt(i));
            }
            else if(stack.peek() > sb.charAt(i)) {
                while(!stack.isEmpty() && k > 0) {
                    if(stack.peek() <= sb.charAt(i)) {
                        break;
                    }
                    stack.pop();
                    k--;
                }
                stack.push(sb.charAt(i));
            }
            else {
                stack.push(sb.charAt(i));
            }
        }
        
        while(!stack.isEmpty() && k > 0) {
            stack.pop();
            k--;
        }
        
        if(stack.isEmpty()) {
            return "0";
        }
        
        while(!stack.isEmpty()) {
            answer.insert(0, stack.pop());
        }
        
        return answer.toString();
    }
}