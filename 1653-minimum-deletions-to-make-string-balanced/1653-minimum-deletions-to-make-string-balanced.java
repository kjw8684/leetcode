class Solution {
    public int minimumDeletions(String s) {
        int len = s.length(), acount = 0, bcount = 0, answer = 0, start = 0;
        while(start < len) {
            if(s.charAt(start) == 'b') {
                break;
            }

            start++;
        }

        for(int i = start; i < len; i++) {
            if(i > 0 && s.charAt(i) == 'b' && s.charAt(i - 1) == 'a') {
                if(bcount < acount) {
                    answer += bcount;
                    bcount = 0;
                    acount = 0;
                }
            }

            if(s.charAt(i) == 'b') {
                bcount++;
            }
            else {
                acount++;
            }
        }

        if(bcount < acount) {
            answer += bcount;
        }
        else {
            answer += acount;
        }

        return answer;
    }
}