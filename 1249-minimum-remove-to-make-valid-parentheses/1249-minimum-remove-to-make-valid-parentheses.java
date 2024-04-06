class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        int count = 0;
        for(int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == ')' && count == 0) {
                sb.delete(i, i + 1);
                i--;
                continue;
            }
            
            if(sb.charAt(i) == '(') {
                count++;
                continue;
            }
            if(sb.charAt(i) == ')') {
                count--;
            }
        }
        
        if(count != 0) {
            for(int i = sb.length() - 1; count != 0; i--) {
                if(sb.charAt(i) == '(') {
                    sb.delete(i, i + 1);
                    count--;
                }
            }
        }
        
        return sb.toString();
    }
}