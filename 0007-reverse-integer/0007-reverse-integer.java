class Solution {
    public int reverse(int x) {
        long answer = 0L;

        while(x != 0) {
            answer *= 10;
            answer += x % 10;
            x /= 10;
        }

        if(answer > Integer.MAX_VALUE || answer < Integer.MIN_VALUE) {
            return 0;
        }

        return (int)answer;
    }
}