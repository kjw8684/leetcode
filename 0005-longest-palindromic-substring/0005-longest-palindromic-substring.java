class Solution {
    public String longestPalindrome(String s) {
        int len = s.length(), p = -1, r = -1;
        StringBuilder sb = new StringBuilder();
        sb.append('@');

        for (int i = 0; i < len; i++) {
            sb.append(s.charAt(i));
            if (i < len - 1) {
                sb.append('@');
            }
        }
        sb.append('@');

        String insert_s = sb.toString();
        len = insert_s.length();
        int[] res = new int[len];

        for (int i = 0; i < len; i++) {
            if (i > r) {
                p = i;
                r = i;
                while (r < len && r <= 2 * p && insert_s.charAt(r) == insert_s.charAt(2 * p - r)) {
                    r++;
                }
                r--;
                res[i] = r - p;
            }
            else {
                int j = 2 * p - i;
                if (res[j] < r - i) {
                    res[i] = res[j];
                }
                else if(res[j] > r - i) {
                    res[i] = r - i;
                }
                else {
                    p = i;
                    while (r < len && r <= 2 * p && insert_s.charAt(r) == insert_s.charAt(2 * p - r)) {
                        r++;
                    }
                    r--;
                    res[i] = r - p;
                }
            }
        }

        int max = 0, left = 0, rigth = 1;
        for (int i = 0; i < len; i++) {
            if (res[i] > max) {
                max = res[i];
                left = i - res[i];
                rigth = i + res[i];
            }
        }
        String answer = insert_s.substring(left, rigth);
        return answer.replace("@", "");
    }
}