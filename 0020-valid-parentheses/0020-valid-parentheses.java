class Solution {
    public boolean isValid(String s) {
        int small = 0, middle = 0, large = 0;
        Deque<Integer> stack = new ArrayDeque<>();

        for(char cur : s.toCharArray()) {
            if(cur == '(') {
                stack.push(1);
                small++;
            }
            else if(cur == ')') {
                if(stack.size() == 0) {
                    return false;
                }
                if(stack.pop() != 1) {
                    return false;
                }
                small--;
            }
            else if(cur == '{') {
                stack.push(2);
                middle++;
            }
            else if(cur == '}') {
                if(stack.size() == 0) {
                    return false;
                }
                if(stack.pop() != 2) {
                    return false;
                }
                middle--;
            }
            else if(cur == '[') {
                stack.push(3);
                large++;
            }
            else {
                if(stack.size() == 0) {
                    return false;
                }
                if(stack.pop() != 3) {
                    return false;
                }
                large--;
            }
        }

        return small == 0 && middle == 0 && large == 0;
    }
}