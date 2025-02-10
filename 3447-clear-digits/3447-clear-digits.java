class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length(), haveDigit = 0;
        char cur;

        for(int i = len - 1; i >= 0; i--) {
            cur = s.charAt(i);
            if(isDigit(cur)) {
                if(haveDigit < 0) {
                    haveDigit = 0;
                }
                haveDigit++;
            }
            else {
                if(haveDigit <= 0) {
                    sb.insert(0, cur);
                }
                haveDigit--;
            }
            
        }


        return sb.toString();
    }


    public boolean isDigit(char a) {
        if(a >= '0' && a <= '9') {
            return true;
        }

        return false;
    }
}