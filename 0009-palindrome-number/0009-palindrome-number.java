class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }

        int target = x, reverse = 0;

        while(target != 0) {
            reverse *= 10;
            reverse += target % 10;
            target /= 10;
        }

        return reverse == x;
    }
}