class Solution {
    public int numSub(String s) {
        int len = s.length(), count = 0, answer = 0;

        for(int i = 0; i < len; i++) {
            if(s.charAt(i) == '1') {
                count++;
                answer += count;
                answer %= 1000000007;
            }
            else {
                count = 0;
            }
        }

        return answer;
    }
}