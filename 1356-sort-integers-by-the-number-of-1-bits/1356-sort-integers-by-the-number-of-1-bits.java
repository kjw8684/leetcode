class Solution {
    public int[] sortByBits(int[] arr) {
        int len = arr.length;
        int[][] bit = new int[2][len];

        for(int i = 0; i < len; i++) {
            bit[0][i] = arr[i];
            bit[1][i] = bitcount(arr[i]);
        }

        int tempval = 0, tempcount = 0;
        for(int i = 0; i < len; i++) {
            for(int j = i + 1; j < len; j++) {
                if(bit[1][i] > bit[1][j] || (bit[1][i] == bit[1][j] && bit[0][i] > bit[0][j])) {
                    tempval = bit[0][i];
                    tempcount = bit[1][i];
                    bit[0][i] = bit[0][j];
                    bit[1][i] = bit[1][j];
                    bit[0][j] = tempval;
                    bit[1][j] = tempcount;
                }
            }
        }

        return bit[0];
    }

    public int bitcount(int num) {
        int count = 0;
        while(num != 0) {
            if(num % 2 == 1) {
                count++;
            }
            num /= 2;
        }

        return count;
    }
}