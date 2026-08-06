class Solution {
    public int smallestNumber(int n, int t) {
        while(true) {
            int temp = n, cur = 1;
            while(temp != 0) {
                cur *= temp % 10;
                temp /= 10;
            }
            if(cur % t == 0) {
                break;
            }
            n++;
        }
        return n;
    }
}