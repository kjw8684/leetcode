class Solution {
    public int totalWaviness(int num1, int num2) {
        int count = 0;

        for(int i = Math.max(100, num1); i <= num2; i++) {
            int cur = i, before1 = (cur % 100) / 10, before2 = cur % 10;
            cur /= 100;
            while(cur != 0) {
                if((before1 > cur % 10 && before1 > before2) || (before1 < cur % 10 && before1 < before2)){
                    count++;
                }
                before2 = before1;
                before1 = cur % 10;
                cur /= 10;
            }
        }

        return count;
    }
}