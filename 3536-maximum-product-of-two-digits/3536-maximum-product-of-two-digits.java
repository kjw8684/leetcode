class Solution {
    public int maxProduct(int n) {
        int first = 0, second = 0;

        while(n != 0) {
            int cur = n % 10;
            if(second < cur) {
                second = cur;
            }

            if(first < second) {
                int temp = first;
                first = second;
                second = temp;
            }

            n /= 10;
        }

        return first * second;
    }
}