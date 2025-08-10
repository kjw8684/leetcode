class Solution {
    public boolean reorderedPowerOf2(int n) {
        int digit = (int)Math.log10(n), index = 0;
        int[][] power = new int[4][10];
        int[] N = new int[10];

        for(int i = 0; i < 32; i++) {
            int cur = (int)Math.pow(2, i);
            if((int)Math.log10(cur) == digit) {
                while(cur != 0) {
                    power[index][cur % 10]++;
                    cur /= 10;
                }
                index++;
            }
            else if((int)Math.log10(cur) > digit) {
                break;
            }
        }

        while(n != 0) {
            N[n % 10]++;
            n /= 10;
        }

        for(int i = 0; i < 4; i++) {
            boolean check = true;
            for(int j = 0; j < 10; j++) {
                if(power[i][j] != N[j]) {
                    check = false;
                    break;
                }
            }

            if(check) {
                return true;
            }
        }

        return false;
    }
}