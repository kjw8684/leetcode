class Solution {
    public int countPalindromicSubsequence(String s) {
        int len = s.length(), count = 0;
        int[][] check = new int[len][26];
        int[] alpha = new int[26];
        boolean[] dup = new boolean[26];

        for(int i = 0; i < len; i++) {
            for(int j = 0; j < 26; j++) {
                check[i][j] = -1;
            }
        }

        for(int i = 0; i < 26; i++) {
            alpha[i] = -1;
        }
        
        for(int i = 1; i < len; i++) {
            alpha[s.charAt(i - 1) - 'a'] = i - 1;
            for(int j = 0; j < 26; j++) {
                check[i][j] = alpha[j];
            }
        }

        for(int i = len - 1; i >= 0; i--) {
            int curi = s.charAt(i) - 'a';
            if(!dup[curi]) {
                for(int j = 0; j < 26; j++) {
                    if(check[i][j] != -1 && check[check[i][j]][curi] != -1) {
                        count++;
                    }
                }
                
                dup[curi] = true;
            }   
        }

        return count;
    }
}