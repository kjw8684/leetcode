class Solution {
    public String shortestPalindrome(String s) {
        String newString = s + '#' + new StringBuilder(s).reverse().toString();
        int[] pi = new int[newString.length()];
        int i = 1, k = 0;
        while (i < newString.length()) {
            if (newString.charAt(i) == newString.charAt(k)) {
                k++;
                pi[i] = k;
                i++;
            } else {
                if (k > 0) {
                    k = pi[k - 1];
                } else {
                    pi[i] = 0;
                    i++;
                }
            }
        }

        return new StringBuilder(s.substring(pi[newString.length() - 1])).reverse().toString() + s;
    }
}