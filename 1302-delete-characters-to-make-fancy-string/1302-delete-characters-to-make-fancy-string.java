class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        char pre = '1', cur = 'a';
        int len = s.length(), count = 0;

        for(int i = 0; i < len; i++) {
            cur = s.charAt(i);
            if(cur == pre) {
                count++;
            }
            else {
                count = 0;
                pre = cur;
            }
            
            if(count < 2) {
                sb.append(cur);
            }
        }

        return sb.toString();
    }
}