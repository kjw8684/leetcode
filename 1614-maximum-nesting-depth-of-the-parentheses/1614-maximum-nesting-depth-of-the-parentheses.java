class Solution {
    public int maxDepth(String s) {
        int len = s.length(), answer = 0, max = 0;
        
        for(int i = 0; i < len; i++) {
            if(s.charAt(i) == '(') {
                max++;
                if (answer < max) {answer = max;}
            }
            
            if(s.charAt(i) == ')') {
                max--;
            }
        }
        
        return answer;
    }
}