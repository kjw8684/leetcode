class Solution {
    public int minSteps(int n) {
        int screen = 1, copy = 0, count = 0;

        while(true) {
            if(screen == n) {
                return count;
            }

            if(n % screen == 0) {
                copy = screen;
                screen += copy;
                count++;
            }
            else {
                screen += copy;
            }

            count++;
        }
    }
}