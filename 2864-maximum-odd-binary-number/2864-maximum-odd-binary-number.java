class Solution {
    public String maximumOddBinaryNumber(String s) {
        int len = s.length(), one = 0, zero = 0;
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '0') {
                zero++;
                continue;
            }
            
            one++;
        }
        one--;
        
        for (int i = 0; i < one; i++) {
            answer.append("1");
        }
        
        for (int i = 0; i < zero; i++) {
            answer.append("0");
        }
        
        answer.append("1");
        
        return answer.toString();
    }
}