class Solution {
    public boolean hasAlternatingBits(int n) {
        boolean check = true, one = true;

        one = n % 2 == 0;
        n /= 2;

        while(n != 0) {
            if(!one && n % 2 == 0) {
                one = true;
            }
            else if(one && n % 2 == 1) {
                one = false;
            }
            else {
                check = false;
                break;
            }
            n /= 2;
        }
 
        return check;
    }
}