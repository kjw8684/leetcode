class Solution {
    public int maximum69Number (int num) {
        int first = -1, cur = num, answer = 0, len = (int)Math.log10(num), digit = 1;

        for(int i = 0; i <= len; i++) {
            if(cur % 10 == 6) {
                first = i;
            }
            cur /= 10;
        }
        cur = num;

        for(int i = 0; i <= len; i++) {
            if(i == first) {
                answer += 9 * digit;
            }
            else {
                answer += (cur % 10) * digit;
            }

            cur /= 10;
            digit *= 10;
        }

        return answer;
    }
}