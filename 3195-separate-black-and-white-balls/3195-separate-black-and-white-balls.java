class Solution {
    public long minimumSteps(String s) {
        int len = s.length(), count = 0;
        long sum = 0;

        for(int i = 0; i < len; i++) {
            if(s.charAt(i) == '1') {
                count++;
            }
            else {
                sum += count;
            }
        }

        return sum;
    }
}