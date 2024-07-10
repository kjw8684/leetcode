class Solution {
    public int minOperations(String[] logs) {
        int now = 0, len = logs.length;

        for(int i = 0; i < len; i++) {
            if(logs[i].equals("../")) {
                now--;
            }
            else if(logs[i].equals("./")) {
                continue;
            }
            else {
                now++;
            }

            if(now < 0) {
                now = 0;
            }
        }

        return now;
    }
}