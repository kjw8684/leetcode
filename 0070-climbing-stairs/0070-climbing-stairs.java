class Solution {
    public int climbStairs(int n) {
        if (n == 1) {return 1;}
        if (n == 2) {return 2;}
        
        int answer = 0, memory1 = 1, memory2 = 2;

        for (int i = 2; i < n; i++) {
            answer = memory1 + memory2;
            memory1 = memory2;
            memory2 = answer;
        }

        return answer;
    }
}