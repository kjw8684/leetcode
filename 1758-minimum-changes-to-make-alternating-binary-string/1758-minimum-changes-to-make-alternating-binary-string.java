class Solution {
    public int minOperations(String s) {
        int len = s.length(), count = 0, before = s.charAt(0) - '0';

        for(int i = 1; i < len; i++) {
            int cur = s.charAt(i) - '0';
            if(before == cur) {
                before++;
                if(before > 1) {
                    before = 0;
                }
                count++;
            }
            else {
                before = cur;
            }
        }

        return Math.min(count, len - count);
    }
}