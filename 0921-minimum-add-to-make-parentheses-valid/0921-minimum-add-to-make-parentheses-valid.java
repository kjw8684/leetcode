class Solution {
    public int minAddToMakeValid(String s) {
        int len = s.length(), sum = 0, answer = 0;

        for(int i = 0; i < len; i++) {
            if(s.charAt(i) == '(') {
                sum++;
            }
            else if(sum == 0){
                answer++;
            }
            else {
                sum--;
            }
        }

        return answer + sum;
    }
}