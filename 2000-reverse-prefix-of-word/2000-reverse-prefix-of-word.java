class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int len = word.length(), index = 0;
        
        for(int i = 0; i < len; i++) {
            stack.push(word.charAt(i));
            if(word.charAt(i) == ch) {
                index = i;
                break;
            }
        }
        
        if(index == 0) {
            return word;
        }
        
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        
        sb.append(word.substring(index + 1, len));
        return sb.toString();
    }
}