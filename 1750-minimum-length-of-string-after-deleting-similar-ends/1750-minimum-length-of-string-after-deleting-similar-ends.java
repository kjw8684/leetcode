class Solution {
    public int minimumLength(String s) {
        int len = 0, start = 0, end = 0;
        StringBuilder sb = new StringBuilder(s);
        
        while(!sb.equals("")) {
            len = sb.length() - 1;
            start = 0;
            if (sb.charAt(0) == sb.charAt(len)) {
                for (int i = 1; i < len; i++) {
                    if (sb.charAt(i) != sb.charAt(0)) {
                        start = i;
                        break;
                    }
                }
                
                for (int i = len; i > 0; i--) {
                    if (sb.charAt(i) != sb.charAt(0)) {
                        end = i + 1;
                        break;
                    }
                }
                if (start == 0) {
                    if (sb.length() == 1) {
                        return 1;
                    }
                    return 0;
                }
                sb.delete(end, len + 1);
                sb.delete(0, start);
            }
            else {
                break;
            }
        }
        System.out.println(sb);
        
        return len + 1;
    }
}