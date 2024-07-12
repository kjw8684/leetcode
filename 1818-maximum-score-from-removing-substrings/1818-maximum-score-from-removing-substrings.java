class Solution {
    public int maximumGain(String s, int x, int y) {
        StringBuilder sb = new StringBuilder(s);
        int point = 0;
        
        if(x > y) {
            for(int i = 0; i < sb.length() - 1; i++) {
                if(sb.charAt(i) == 'a' && sb.charAt(i + 1) == 'b') {
                    sb.delete(i, i + 2);
                    point += x;
                    i -= 2;
                    if (i == -2) {
                        i = -1;
                    }
                }
            }
            for(int i = 0; i < sb.length() - 1; i++) {
                if(sb.charAt(i) == 'b' && sb.charAt(i + 1) == 'a') {
                    sb.delete(i, i + 2);
                    point += y;
                    i -= 2;
                    if (i == -2) {
                        i = -1;
                    }
                }
            }
        }
        else {
            for(int i = 0; i < sb.length() - 1; i++) {
                if(sb.charAt(i) == 'b' && sb.charAt(i + 1) == 'a') {
                    sb.delete(i, i + 2);
                    point += y;
                    i -= 2;
                    if (i == -2) {
                        i = -1;
                    }
                }
            }
            for(int i = 0; i < sb.length() - 1; i++) {
                if(sb.charAt(i) == 'a' && sb.charAt(i + 1) == 'b') {
                    sb.delete(i, i + 2);
                    point += x;
                    i -= 2;
                    if (i == -2) {
                        i = -1;
                    }
                }
            }
        }

        return point;
    }
}