class Solution {
    public long countCommas(long n) {
        long count = 0L, pow = 1000L, cur = 1000L;

        while(n >= cur) {
            cur--;
            count += n - cur;
            cur++;
            cur *= pow;
        }

        return count;
    }
}