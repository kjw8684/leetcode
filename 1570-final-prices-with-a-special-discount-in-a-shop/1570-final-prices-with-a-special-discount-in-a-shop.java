class Solution {
    public int[] finalPrices(int[] prices) {
        int len = prices.length;
        int[] answer = new int[len];

        for(int i = 0; i < len; i++) {
            answer[i] = prices[i];

            for(int j = i + 1; j < len; j++) {
                if(prices[j] <= prices[i]) {
                    answer[i] -= prices[j];
                    break;
                }
            }
        }

        return answer;
    }
}