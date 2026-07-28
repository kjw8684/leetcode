class Solution {
    public String smallestPalindrome(String s) {
        int[] alpha = new int[26];

        for(char cur : s.toCharArray()) {
            alpha[cur - 'a']++;
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 26; i++) {
            if(alpha[i] % 2 == 1) {
                alpha[i]--;
                sb.append((char)('a' + i));
                break;
            }
        }

        for(int i = 25; i >= 0; i--) {
            if(alpha[i] != 0) {
                String cur = String.valueOf((char)('a' + i));
                sb.append(cur.repeat(alpha[i] / 2));
                sb.insert(0, cur.repeat(alpha[i] / 2));
            }
        }

        return sb.toString();
    }
}