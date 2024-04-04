class Solution {
    public int maxDepth(String s) {
        int len = s.length(), answer = 0;;
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < len; i++) {
            if(s.charAt(i) == '(') {
                stack.push(1);
                if (answer < stack.size()) {
                    answer = stack.size();
                }
                continue;
            }
            
            if(s.charAt(i) == ')') {
                stack.pop();
            }
        }
        
        return answer;
    }
}