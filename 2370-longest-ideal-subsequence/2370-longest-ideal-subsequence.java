class Solution {
    public int longestIdealString(String s, int k) {
        int[] alpha = new int[26];
        int len = s.length();
        
        for(int i = 0; i < len; i++) {
            search(alpha, s.charAt(i), k);
        }
        
        Arrays.sort(alpha);
        return alpha[25];
    }
    
    public void search(int[] alpha, char current, int k) {
        int current_int = current - 'a';
        for(int i = current_int; i < 26 && i <= current_int + k; i++) {
            alpha[current_int] = Math.max(alpha[current_int], alpha[i] + 1);
        }
        
        for(int i = current_int - 1; i > -1 && i >= current_int - k; i--) {
            alpha[current_int] = Math.max(alpha[current_int], alpha[i] + 1);
        }
    }

}