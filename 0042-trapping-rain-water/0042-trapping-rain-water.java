class Solution {
    public int trap(int[] height) {
        int len = height.length, answer = 0, start = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < len; i++) {
            if(stack.isEmpty()) {
                start = height[i];
                stack.push(height[i]);
            }
            else if(stack.peek() == start && start <= height[i]) {
                start = height[i];
                stack.pop();
                stack.push(height[i]);
            }
            else if(start > height[i]) {
                stack.push(height[i]);
            }
            else {
                while(!stack.isEmpty()) {
                    answer += start - stack.pop();
                }
                start = height[i];
                stack.push(height[i]);
            }
        }
        
        start = 0;
        while(!stack.isEmpty()) {
            if(stack.peek() >= start) {
                start = stack.pop();
            }
            else {
                answer += start - stack.pop();
            }
        }
        
        return answer;
    }
}