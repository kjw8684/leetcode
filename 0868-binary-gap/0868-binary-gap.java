class Solution {
    public int binaryGap(int n) {
        int count = 1, max = 0;

        while(n % 2 == 0) {
            n /= 2;
        }
        n /= 2;

        while(n != 0) {
            if(n % 2 == 1) {
                max = Math.max(count, max);
                count = 0;
            }
            count++;
            n /= 2;
        }

        return max;
    }
}