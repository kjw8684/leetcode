class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        boolean two = false, cur = true;

        for(int bit : bits) {
            if(two) {
                two = false;
            }
            else if(bit == 1) {
                two = true;
                cur = true;
            }
            else {
                cur = false;
            }
        }

        return !cur;
    }
}