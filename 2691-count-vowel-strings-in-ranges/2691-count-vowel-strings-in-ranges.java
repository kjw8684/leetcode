class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int wlen = words.length, qlen = queries.length;
        int[] dp = new int[wlen], ans = new int[qlen];
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        int temp = 0, sum = 0;
        for(int i = 0; i < wlen; i++) {
            temp = words[i].length();

            if(set.contains(words[i].charAt(0)) && set.contains(words[i].charAt(temp - 1))) {
                sum++;
            }
            dp[i] = sum;
        }

        for(int i = 0; i < qlen; i++) {
            if(queries[i][0] == 0) {
                ans[i] = dp[queries[i][1]];
            }

            else {
                ans[i] = dp[queries[i][1]] - dp[queries[i][0] - 1];
            }
        }

        return ans;
    }
}