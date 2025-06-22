class Solution {
    public String[] divideString(String s, int k, char fill) {
        StringBuilder sb = new StringBuilder(s);
        int len = k - (s.length() % k);
        if(len == k) {
            len = 0;
        }
        for(int i = 0; i < len; i++) {
            sb.append(fill);
        }

        len = sb.length() / k;

        String[] answer = new String[len];

        for(int i = 0; i < len; i++) {
            answer[i] = sb.substring(i * k, i * k + k);
        }

        return answer;
    }
}