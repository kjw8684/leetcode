class Solution {
    public int myAtoi(String s) {
        long answer = 0L;
        int len = s.length(), index = 0;
        while(len > index && s.charAt(index) == ' ') {
            index++;
        }
        if (len == index) return 0;
        boolean positive = s.charAt(index) != '-';

        for(int i = index; i < len; i++) {
            char cur = s.charAt(i);
            if(i == index && (cur == '+' || cur == '-')) {
                continue;
            }
            if(cur <= '9' && cur >= '0') {
                answer *= 10;
                answer += cur - '0';
            }
            else {
                break;
            }

            if(answer > Integer.MAX_VALUE || answer < Integer.MIN_VALUE) {
                break;
            }
        }

        answer = cal(answer, positive);

        if(answer > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if(answer < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int)answer;
    }

    public long cal(long cur, boolean pos) {
        if(pos) {
            return cur;
        }
        return 0 - cur;
    }

}