class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0, digit = 0, left = 0, right = 0, current = 0;

        for(int i = low; i <= high; i++) {
            digit = (int)Math.log10(i) + 1;
            if(digit % 2 == 1) {
                continue;
            }
            else {
                current = i;
                left = 0;
                right = 0;
                digit /= 2;

                for(int j = 1; j <= digit; j++) {
                    left += current % 10;
                    current /= 10;
                }

                for(int j = digit + 1; j <= digit * 2; j++) {
                    right += current % 10;
                    current /= 10;
                }

                if(left == right) {
                    count++;
                }
            }
        }

        return count;
    }
}