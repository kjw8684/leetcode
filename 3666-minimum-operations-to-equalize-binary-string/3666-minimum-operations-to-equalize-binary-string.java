class Solution {
    public int minOperations(String s, int k) {
        int len = s.length(), zero = 0;
        
        for(int i = 0; i < len; i++) {
            if(s.charAt(i) == '0') {
                zero++;
            }
        }

        if (zero == 0)
            return 0;

        if (len == k)
            return ((zero == len ? 1 : 0) << 1) - 1;

        int base = len - k;

        int odd = Math.max(
            (zero + k - 1) / k,
            (len - zero + base - 1) / base
        );

        odd += ~odd & 1;

        int even = Math.max(
            (zero + k - 1) / k,
            (zero + base - 1) / base
        );

        even += even & 1;

        int res = Integer.MAX_VALUE;

        if ((k & 1) == (zero & 1))
            res = Math.min(res, odd);

        if ((~zero & 1) == 1)
            res = Math.min(res, even);

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}