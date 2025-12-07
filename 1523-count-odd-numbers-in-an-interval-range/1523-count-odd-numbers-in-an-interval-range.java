class Solution {
    public int countOdds(int low, int high) {
        if(high % 2 == 1) {
            high++;
        }
        return high / 2 - low / 2;
    }
}