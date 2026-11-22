class Solution {
    public boolean checkString(String s) {
        boolean bappears = false;

        for(char c : s.toCharArray()) {
            if(c == 'b') {
                bappears = true;
            }
            else if(bappears){
                return false;
            }
        }

        return true;
    }
}