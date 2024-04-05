class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        while(sb.length() > 1) {
            if ((sb.charAt(i) == Character.toLowerCase(sb.charAt(i + 1)) || Character.toLowerCase(sb.charAt(i)) == sb.charAt(i + 1)) && sb.charAt(i) != sb.charAt(i + 1)) {
                sb.delete(i, i + 2);
                i = 0;
                continue;
            }
            i++;
            if(i == sb.length() - 1) {
                break;
            }
        }
        
        return sb.toString();
    }
}