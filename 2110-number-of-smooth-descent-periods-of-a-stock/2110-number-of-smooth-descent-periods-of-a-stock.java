class Solution {
    public long getDescentPeriods(int[] prices) {
        int len = prices.length, count = 1;
        long answer = 1L;

        for(int i = 1; i < len; i++) {
            if(prices[i] == prices[i - 1] - 1) {
                count++;
            }
            else {
                count = 1;
            }

            answer += count;
        }

        return answer;
    }
}