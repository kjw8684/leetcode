class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int empty = 0, sum = 0;

        while(numBottles != 0) {
            empty += numBottles;
            sum += numBottles;
            numBottles = empty / numExchange;
            empty %= numExchange;
        }

        return sum;
    }
}