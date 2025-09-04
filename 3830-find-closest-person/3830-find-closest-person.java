class Solution {
    public int findClosest(int x, int y, int z) {
        int difx = Math.abs(x - z), dify = Math.abs(y - z);

        if(difx < dify) {
            return 1;
        }
        else if(difx > dify) {
            return 2;
        }
        return 0;
    }
}