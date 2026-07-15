class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd = 0, even = 0;

        for(int i = 1; i <= n * 2; i++) {
            if(i % 2 == 1) {
                odd += i;
            }
            else {
                even += i;
            }
        }

        return gcd(odd, even);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
}