class Solution {
    public String smallestNumber(String pattern) {
        int len = pattern.length();
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int index = 0;

        for(int i = 0; i <= len; i++) {
            stack.push(i + 1);
            index++;

            if(i == len || pattern.charAt(i) == 'I') {
                while(index > 0) {
                    index--;
                    sb.append(stack.pop());
                }
            } 
        }

        return sb.toString();
    }
}