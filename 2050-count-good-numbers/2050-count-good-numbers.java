class Solution {
    static final int MOD = 1000000007;

    public int countGoodNumbers(long chakraLength) {
        long evenPositions = (chakraLength + 1) / 2, oddPositions = chakraLength / 2, evenWays = fastPower(5, evenPositions), oddWays = fastPower(4, oddPositions);

        return (int)((evenWays * oddWays) % MOD);
    }

    long fastPower(long base, long power) {
        long result = 1;
        base %= MOD;

        while (power > 0) {
            if (power % 2 == 1) {
                result = (result * base) % MOD; // apply current jutsu
            }
            base = (base * base) % MOD; // double chakra burst
            power /= 2; // halve the turns
        }
        return result;
    }
}