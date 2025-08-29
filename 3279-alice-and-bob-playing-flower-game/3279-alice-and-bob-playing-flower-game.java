class Solution {
    public long flowerGame(int n, int m) {
        long n1 = n / 2, n2 = n / 2, m1 = m / 2, m2 = m / 2;

        if(n % 2 == 1) {
            n1++;
        }

        if(m % 2 == 1) {
            m1++;
        }   

        return n1 * m2 + m1 * n2;
    }
}