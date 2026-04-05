class Solution {
    public boolean judgeCircle(String moves) {
        int len = moves.length(), up = 0, side = 0;


        for(int i = 0; i < len; i++) {
            char cur = moves.charAt(i);
            if(cur == 'U') {
                up++;
            }
            else if(cur == 'D') {
                up--;
            }
            else if(cur == 'L') {
                side++;
            }
            else {
                side--;
            }
        }

        return up == 0 && side == 0;
    }
}