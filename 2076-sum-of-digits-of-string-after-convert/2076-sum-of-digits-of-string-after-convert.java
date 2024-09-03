class Solution {
    public int getLucky(String s, int k) {
        int sum = 0, len = s.length(), temp = 0;

        for(int i = 0; i < len; i++) {
            temp = s.charAt(i) - 'a' + 1;
            while(temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
        }

        while(k != 1) {
            temp = sum;
            sum = 0;
            while(temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            k--;
        }

        return sum;
    }
}