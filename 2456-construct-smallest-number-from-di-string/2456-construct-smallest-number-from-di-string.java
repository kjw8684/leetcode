class Solution {
    public String smallestNumber(String pattern) {
        int len = pattern.length();
        int[] stack = new int[len + 1];
        StringBuilder sb = new StringBuilder();
        int index = 0;

        for(int i = 0; i <= len; i++) {
            stack[index++] = i + 1;

            if(i == len || pattern.charAt(i) == 'I') {
                while(index > 0) {
                    sb.append(stack[--index]);
                }
            } 
        }

        return sb.toString();
    }
}