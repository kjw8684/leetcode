class Solution {
    public boolean checkValidString(String s) {
        int len = s.length(), low = 0, high = 0;

        for(int i = 0; i < len; i++) {
            char cur = s.charAt(i);
            if(cur == '(') {
                low++;
                high++;
            }
            else if(cur == '*') {
                low--;
                high++;
            }
            else {
                low--;
                high--;
            }
            low = Math.max(0, low);

            if(high < 0) {
                return false;
            }
        }

        return low == 0;
    }
}