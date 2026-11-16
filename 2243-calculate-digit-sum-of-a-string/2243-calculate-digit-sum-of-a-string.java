class Solution {
    public String digitSum(String s, int k) {
        int len = s.length();
        StringBuilder sb = new StringBuilder();

        while(len > k) {
            for(int i = 0; i < len; i += k) {
                int cur = 0;
                for(int j = 0; j < k && i + j < len; j++) {
                    cur += s.charAt(i + j) - '0';
                }
                sb.append(cur);
            }

            s = sb.toString();
            len = s.length();
            sb.setLength(0);
        }

        return s;
    }
}