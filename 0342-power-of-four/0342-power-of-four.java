class Solution {
    public boolean isPowerOfFour(int n) {
        double x = -1, i = 0, answer = n;
        while (x < n) {
            x = Math.pow(4, i);
            if (answer == x) {
                return true;
            }
            i++;
        }
        return false;
    }
}