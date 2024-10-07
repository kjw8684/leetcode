class Solution {
    public int minLength(String s) {
        StringBuilder sb = new StringBuilder(s);
        int ab = sb.indexOf("AB"), cd = sb.indexOf("CD");

        while(ab != -1 || cd != -1) {
            if(ab >= 0) {
                sb.delete(ab, ab + 2);
            }
            else {
                sb.delete(cd, cd + 2);
            }

            ab = sb.indexOf("AB");
            cd = sb.indexOf("CD"); 
        }

        return sb.length();
    }
}