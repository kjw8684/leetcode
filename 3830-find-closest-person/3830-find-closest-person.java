class Solution {
    public int findClosest(int x, int y, int z) {
        int difx = Math.abs(x - z), dify = Math.abs(y - z);

        if(difx == dify) {
            return 0;
        }
        return difx > dify ? 2 : 1;
    }
}