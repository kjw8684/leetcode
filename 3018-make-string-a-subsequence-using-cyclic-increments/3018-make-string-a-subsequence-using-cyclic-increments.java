class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int len1 = str1.length(), len2 = str2.length(), index1 = 0, index2 = 0;
        char cur1 = ' ', cur2 = ' ';
        while(index1 < len1 && index2 < len2) {
            cur1 = str1.charAt(index1);
            cur2 = str2.charAt(index2);
            if(cur1 == 'z') {
                if(cur2 != cur1 && cur2 != 'a') {
                    index1++;
                    continue;
                }
                else {
                    index1++;
                    index2++;
                    continue;
                }
            }
            else {
                if(cur2 != cur1 && cur2 != cur1 + 1) {
                    index1++;
                    continue;
                }
                else {
                    index1++;
                    index2++;
                    continue;
                }
            }
        }

        return index2 == len2;
    }
}