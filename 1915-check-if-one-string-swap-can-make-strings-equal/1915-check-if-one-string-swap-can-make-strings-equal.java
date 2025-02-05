class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        char curS1, curS2;
        int len = s1.length(), diffrent = -1;

        for(int i = 0; i < len; i++) {
            curS1 = s1.charAt(i);
            curS2 = s2.charAt(i);
            if(curS1 != curS2) {
                if(diffrent == -1) {
                    diffrent = i;
                }
                else if(diffrent != -2 && s1.charAt(diffrent) == curS2 && s2.charAt(diffrent) == curS1) {
                    diffrent = -2;
                }
                else {
                    return false;
                }
            }
        }

        return diffrent < 0;
    }
}