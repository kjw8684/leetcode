class Solution {
    public int scoreOfParentheses(String s) {
        int len = s.length(), sum = 0, count = 0;
        int[] depth = new int[25];
        boolean before = false;

        for(int i = 0; i < len; i++) {
            if(s.charAt(i) == '(') {
                depth[count] = sum;
                sum = 0;
                count++;
                before = true;
            }
            else if(before) {
                before = false;
                sum++;
                count--;
                sum += depth[count];
                depth[count] = 0;
            }
            else {
                sum *= 2;
                count--;
                sum += depth[count];
                depth[count] = 0;
                before = false;
            }
        }

        return sum;
    }
}