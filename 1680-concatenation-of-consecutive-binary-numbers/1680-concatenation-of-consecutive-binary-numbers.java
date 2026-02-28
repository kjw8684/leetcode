class Solution {
    public int concatenatedBinary(int n) {
        int modulo = 1000000007, answer = 0, max = 0;

        for(int i = 1; i <= n; i++) {
            int cur = i;
            if(cur >= (int)Math.pow(2, max + 1)) {
                max++;
            }

            for(int j = max; j >= 0; j--) {
                answer *= 2;
                int power = (int)Math.pow(2, j);
                if(cur >= power) {
                    answer++;
                    cur -= power;
                }
                answer %= modulo;
            }
        }

        return answer;
    }
}