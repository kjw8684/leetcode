class Solution {
    public int maxFreqSum(String s) {
        int len = s.length();
        int[] alpha = new int[26];

        for(int i = 0; i < len; i++) {
            alpha[s.charAt(i) - 'a']++;
        }

        int max = 0;

        if(max < alpha[0]) {
            max = alpha[0];
        }
        alpha[0] = 0;
        if(max < alpha[4]) {
            max = alpha[4];
        }
        alpha[4] = 0;
        if(max < alpha[8]) {
            max = alpha[8];
        }
        alpha[8] = 0;
        if(max < alpha[14]) {
            max = alpha[14];
        }
        alpha[14] = 0;
        if(max < alpha[20]) {
            max = alpha[20];
        }
        alpha[20] = 0;

        Arrays.sort(alpha);

        return max + alpha[25];
    }
}