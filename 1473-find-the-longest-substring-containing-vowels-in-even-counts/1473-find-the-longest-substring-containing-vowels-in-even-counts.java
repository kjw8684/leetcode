class Solution {
    public int findTheLongestSubstring(String s) {
        int[] vowel = new int[5];
        int len = s.length(), max = 0;

        for(int i = 0; i < len; i++) {
            if(max > len - i) {
                break;
            }
            Arrays.fill(vowel, 0);
            max = Math.max(max, count(s, i, len, vowel));
        }

        return max;
    }

    public int count(String s, int a, int len, int[] vowel) {
        int cur = 0;
        for(int i = a; i < len; i++) {
            if(s.charAt(i) == 'a') {
                vowel[0]++;
            }
            if(s.charAt(i) == 'e') {
                vowel[1]++;
            }
            if(s.charAt(i) == 'i') {
                vowel[2]++;
            }
            if(s.charAt(i) == 'o') {
                vowel[3]++;
            }
            if(s.charAt(i) == 'u') {
                vowel[4]++;
            }

            if(vowel[0] % 2 == 0 && vowel[1] % 2 == 0 && vowel[2] % 2 == 0 && vowel[3] % 2 == 0 && vowel[4] % 2 == 0) {
                cur = i - a + 1;
            }
        }

        return cur;
    }
}