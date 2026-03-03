class Solution {
    public char findKthBit(int n, int k) {
        if(k == 1) return '0';
        int one = 1;
        boolean invert = false;

        for(int i = 1; i < n; i++) {
            one *= 2;
        }

        while(one > k) {
            one /= 2;
        }
        if(one < k) {
            one *= 2;
        }
        if(one == k) {
            return '1';
        }

        while(one != 0) {
            if(k == 1) {
                break;
            }
            else if(one == k) {
                invert = !invert;
                break;
            }
            else if(one / 2 < k) {
                k = one - k;
                invert = !invert;
            }

            one /= 2;
        }

        if(invert) {
            return '1';
        }

        return '0';
    }
}