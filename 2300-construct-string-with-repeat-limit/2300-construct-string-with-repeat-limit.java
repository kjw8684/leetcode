class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        StringBuilder sb = new StringBuilder();
        int[] alpha = new int[26];
        int len = s.length(), cur = -1, repeat = 0;
        boolean out = true;

        for(int i = 0; i < len; i++) {
            alpha[s.charAt(i) - 97]++;
        }

        for(int i = 25; i >= 0; i--) {
            if(alpha[i] != 0) {
                while(alpha[i] > 0) {
                    out = true;
                    for(int j = 0; j < repeatLimit && alpha[i] > 0; j++) {
                        sb.append((char)(97 + i));
                        alpha[i]--;
                    }

                    if(alpha[i] > 0) {
                        for(int j = i - 1; j >= 0; j--) {
                            if(alpha[j] > 0) {
                                sb.append((char)(97 + j));
                                alpha[j]--;
                                out = false;
                                break;
                            }
                        }

                        if(out) {
                            break;
                        }
                    }
                }
            }
        }

        return sb.toString();
    }
}