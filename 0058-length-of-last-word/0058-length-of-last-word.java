class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length() - 1, answer = 0;
        for(int i =len ; i >= 0; i--) {
            if(answer == 0 && s.charAt(i) == ' ') {
                continue;
            }
            
            if(s.charAt(i) == ' ') {
                break;
            }
            answer++;
        }
        return answer;
    }
}