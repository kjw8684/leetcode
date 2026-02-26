class Solution {
    public int numSteps(String s) {
        int len = s.length(), count = 0, one = 0;
        boolean over = false;

        for(int i = 1; i < len; i++) {
            if(s.charAt(i) == '1') {
                one++;
            }
        }
        if(one == 0) {
            return len - 1;
        }


        for(int i = len - 1; i >= 0; i--) {
            char cur = s.charAt(i);
            if(over && cur == '1') {
                over = true;
            }
            else if(over && cur == '0') {
                count++;
                over = true;
            }
            else if(!over && cur == '1') {
                count++;
                over = true;
            }
            else {
                over = false;
            }
            count++;
        }

        return count;
    }
}