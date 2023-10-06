class Solution {
    public int integerBreak(int n) {
        if (n == 3) return 2;
        if (n == 2) return 1;
        
        int answer = 1;

        while (n != 0) {
            if (n > 4) {
                n -= 3;
                answer *= 3;
            }else if (n == 4) {
                answer *= 4;
                n = 0;
            }else {
                answer *= n;
                n = 0;
            }
        }

        return answer;
        
    }
}