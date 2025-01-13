class Solution {
    public int minimumLength(String s) {
        int len = s.length(), count = len, cur = 0;
        int[] alpha = new int[26];

        for(int i = 0; i < len; i++) {
            cur = s.charAt(i) - 'a';
            alpha[cur]++;

            if(alpha[cur] == 3) {
                alpha[cur] = 1;
                count -= 2;
            }
        }

        return count;
    }
}