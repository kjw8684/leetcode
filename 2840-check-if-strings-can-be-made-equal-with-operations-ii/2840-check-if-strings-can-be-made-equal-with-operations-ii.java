class Solution {
    public boolean checkStrings(String s1, String s2) {
        int len = s1.length();
        int[] evenalpha = new int[26];
        int[] oddalpha = new int[26];

        for(int i = 0; i < len; i++) {
            int cur = s1.charAt(i) - 'a';
            if(i % 2 == 0) {
                evenalpha[cur]++;
            }
            else {
                oddalpha[cur]++;
            }
        }

        for(int i = 0; i < len; i++) {
            int cur = s2.charAt(i) - 'a';
            if(i % 2 == 0) {
                if(evenalpha[cur] == 0) {
                    return false;
                }
                evenalpha[cur]--;
            }
            else {
                if(oddalpha[cur] == 0) {
                    return false;
                }
                oddalpha[cur]--;
            }
        }

        return true;
    }
}