class Solution {
    public String smallestPalindrome(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int count = 0, middle = -1;
        int[] alpha = new int[26];

        for(char cur : s.toCharArray()) {
            alpha[cur - 'a']++;
        }

        for(int i = 0; i < 26; i++) {
            if(alpha[i] % 2 == 1) {
                middle = i;
                alpha[i]--;
            }
            if(alpha[i] != 0) {
                alpha[i] /= 2;
                count += alpha[i];
            }
        }

        if (ways(alpha, count, k) < k) {
            return "";
        }

        while(count > 0) {
            for (int i = 0; i < 26; i++) {
                if (alpha[i] == 0)
                    continue;

                alpha[i]--;
                long next = ways(alpha, count - 1, k);
                alpha[i]++;

                if (k > next) {
                    k -= next;
                } else {
                    sb.append((char)('a' + i));
                    alpha[i]--;
                    count--;

                    break;
                }
            }
        }

        if(middle != -1) {
            return sb.toString() + (char)('a' + middle) + sb.reverse().toString();
        }

        return sb.toString() + sb.reverse().toString();
    }

    private long ways(int[] freq, int remain, long limit) {
        long result = 1L;

        for(int i = 0; i < 26; i++) {
            if(freq[i] == 0) {
                continue;
            }
            long comb = combination(remain, freq[i], limit);

            if (comb > limit / result) {
                return limit + 1;
            }

            result *= comb;
            remain -= freq[i];
        }

        return result;
    }

    private long combination(int n, int r, long limit) {
        r = Math.min(r, n - r);

        long result = 1;

        for (int i = 1; i <= r; i++) {
            result = result * (n - i + 1) / i;

            if (result > limit) {
                return limit + 1;
            }
        }

        return result;
    }
}