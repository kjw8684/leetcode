class Solution {
    public boolean canAliceWin(int n) {
        boolean win = false;

        for(int i = 10; i > 0; i--) {
            if(n >= i) {
                win = !win;
                n -= i;
            }
            else {
                return win;
            }
        }

        return win;
    }
}