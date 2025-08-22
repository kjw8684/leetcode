class Solution {
    public boolean isPowerOfFour(int n) {
        if(n <= 0) {
            return false;
        }
        for(int i = 0; i < 16; i++) {
            int cur = (int)Math.pow(4, i);
            if(n == cur) {
                return true;
            }
            else if(n < cur) {
                return false;
            }
        }

        return false;
    }
}