class Solution {
    public boolean judgeSquareSum(int c) {
        double current = c;
        current = Math.sqrt(current);
        if(current == (int)current) {
            return true;
        }
        
        for(int i = 1; i * i < c && i * i > 0; i++) {
            current = c - i * i;
            current = Math.sqrt(current);
            if(current == (int)current) {
                return true;
            }
        }
        
        return false;
    }
}