class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0, product = 1, target = n;

        while(target != 0) {
            int cur = target % 10;
            sum += cur;
            product *= cur;
            target /= 10;
        }

        return n % (sum + product) == 0;
    }
}