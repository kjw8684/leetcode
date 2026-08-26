class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int len = s.length(), min = len, left = 0, count = 0;
        String answer = "";

        for(int i = 0; i < len; i++) {
            if(s.charAt(i) == '1') {
                count++;
            }

            while(count == k) {
                String cur = s.substring(left, i + 1);
                if(i - left + 1 < min) {
                    min = i - left + 1;
                    answer = cur;
                }
                else if(i - left + 1 == min) {
                    if(answer.equals("")) {
                        answer = cur;
                    }
                    else if(answer.compareTo(cur) > 0) {
                        answer = cur;
                    }
                }

                if(s.charAt(left) == '1') {
                    count--;
                }
                left++;
            }
        }

        return answer;
    }
}