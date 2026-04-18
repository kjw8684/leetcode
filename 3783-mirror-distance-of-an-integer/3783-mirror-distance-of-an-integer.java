class Solution {
    public int mirrorDistance(int n) {
        return Math.abs(n - reverse(n));
    }

    public int reverse(int n) {
        int answer = 0;

        while(n != 0) {
            answer *= 10;
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}