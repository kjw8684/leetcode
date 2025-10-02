class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int count = 0, empty = 0;
        while((numBottles + empty) >= numExchange) {
            count += numBottles;
            empty += numBottles;
            numBottles = 0;
            while(empty >= numExchange) {
                numBottles++;
                empty -= numExchange;
                numExchange++;
            }
        }

        return count + numBottles;
    }
}