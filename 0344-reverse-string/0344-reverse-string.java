class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        char[] answer = new char[len];
        
        for(int i = 0; i < len; i++) {
            answer[i] = s[len - i - 1];
        }
        
        for(int i = 0; i < len; i++) {
            s[i] = answer[i];
        }
    }
}