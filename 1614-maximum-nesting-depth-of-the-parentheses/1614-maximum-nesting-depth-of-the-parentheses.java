class Solution {
    public int maxDepth(String s) {
        int len = s.length(), count = 0, max = 0;

        for(int i = 0; i < len; i++) {
            char cur = s.charAt(i);

            if(cur == '(') {
                count++;
            }
            else if(cur == ')') {
                count--;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}