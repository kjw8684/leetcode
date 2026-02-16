class Solution {
    public int reverseBits(int n) {
        int answer = 0, count = 0;
        while(n != 0) {
            if(n % 2 == 1) {
                answer++;
            }
            n /= 2;
            answer *= 2;
            count++;
        }

        while(count < 31) {
            answer *= 2;
            count++;
        }

        return answer;
    }
}