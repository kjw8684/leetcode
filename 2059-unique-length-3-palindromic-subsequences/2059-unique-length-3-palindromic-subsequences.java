class Solution {
    public int countPalindromicSubsequence(String s) {
        int len = s.length();
        int[] R = new int[26];
        for (int i = 0; i < len; i++) {
            R[s.charAt(i) - 'a']++;
        }

        int[] L = new int[26];
        HashSet<Integer> set = new HashSet<>();
        int cur = 0;
        for (int i = 0; i < len; i++) {
            cur = s.charAt(i) - 'a';
            R[cur]--;
            for (int j = 0; j < 26; j++) {
                if (L[j] > 0 && R[j] > 0) {
                    set.add(26 * cur + j);
                }
            }
            L[cur]++;
        }

        return set.size();
    }
}