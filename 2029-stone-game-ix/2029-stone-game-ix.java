class Solution {
    public boolean stoneGameIX(int[] stones) {
        int[] reast = new int[3];

        for(int stone : stones) {
            reast[stone % 3]++;
        }

        if((reast[1] == 0 || reast[2] == 0) && reast[0] % 2 == 0){
            return false;
        }

        if(Math.abs(reast[1] - reast[2]) <= 2 && reast[0] % 2 == 1) {
            return false;
        }

        return true;
    }
}