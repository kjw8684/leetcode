class Solution {
    public int maxFreqSum(String s) {
        int len = s.length();
        int[] alpha = new int[26];
        int[] vowel = new int[5];

        for(int i = 0; i < len; i++) {
            int cur = s.charAt(i) - 'a';

            if(cur == 0) {
                vowel[0]++;
            }
            else if(cur == 4) {
                vowel[1]++;
            }
            else if(cur == 8) {
                vowel[2]++;
            }
            else if(cur == 14) {
                vowel[3]++;
            }
            else if(cur == 20) {
                vowel[4]++;
            }
            else {
                alpha[cur]++;
            }
        }

        Arrays.sort(vowel);
        Arrays.sort(alpha);

        return vowel[4] + alpha[25];
    }
}