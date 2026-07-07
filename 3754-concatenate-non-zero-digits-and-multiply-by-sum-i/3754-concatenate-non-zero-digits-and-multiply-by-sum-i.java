class Solution {
    public long sumAndMultiply(int n) {
        int sum = 0, temp = 0, index = 0;

        while(n != 0) {
            int cur = n % 10;
            if(cur != 0) {
                temp += cur * Math.pow(10, index);
                sum += cur;
                index++;
            }
            n /= 10;
        }

        return (long)temp * sum;
    }
}