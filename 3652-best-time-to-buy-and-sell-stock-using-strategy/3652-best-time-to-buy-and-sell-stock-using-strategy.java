class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int len = prices.length;
        long cur = 0L;
        for(int i = 0; i < len; i++) {
            cur += prices[i] * strategy[i]; 
        }
        long max = cur;

        for(int i = 0; i < k / 2; i++) {
            cur -= prices[i] * strategy[i];
        }

        for(int i = k / 2; i < k; i++) {
            if(strategy[i] < 1) {
                cur -= prices[i] * strategy[i];
                cur += prices[i];
            }
        }

        max = Math.max(max, cur);

        for(int i = k; i < len; i++) {
            cur += prices[i - k] * strategy[i - k];
            cur -= prices[i - k / 2];
            cur -= prices[i] * strategy[i];
            cur += prices[i];

            max = Math.max(max, cur);
        }

        return max;
    }
}