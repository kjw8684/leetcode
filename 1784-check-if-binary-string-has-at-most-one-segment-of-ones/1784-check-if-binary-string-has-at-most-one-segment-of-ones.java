class Solution {
    public boolean checkOnesSegment(String s) {
        int len = s.length();
        boolean check = true;

        for(int i = 1; i < len; i++) {
            char cur = s.charAt(i);
            if(check && cur == '0') {
                check = false;
            }
            if(!check && cur == '1') {
                return false;
            }
        }

        return true;
    }
}