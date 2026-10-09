class Solution {
    public int minInsertions(String s) {
        int len = s.length(), count = 0, change = 0;
        boolean close = false;

        for(int i = 0; i < len; i++) {
            char cur = s.charAt(i);
            if(cur == '(' && !close) {
                count++;
            }
            else if(cur == '(' && close) {
                if(count > 0){
                    count--;
                    change++;
                }
                else {
                    change += 2;
                }
                count++;
                close = false;
            }
            else if(cur == ')' && close) {
                if(count > 0) {
                    count--;
                }
                else{
                    change++;
                }
                close = false;
            }
            else {
                close = true;
            }
        }
        if(close) {
            if(count > 0){
                count--;
                change++;
            }
            else {
                change += 2;
            }
        }

        return change + (count * 2);
    }
}