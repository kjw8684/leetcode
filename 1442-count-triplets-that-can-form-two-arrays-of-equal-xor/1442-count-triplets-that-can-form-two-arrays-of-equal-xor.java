class Solution {
    public int countTriplets(int[] arr) {
        int len = arr.length, count = 0, a, b;
        
        for(int i = 0; i < len; i++) {
            a = 0;
            for(int j = i + 1; j < len; j++) {
                a ^= arr[j - 1];
                b = 0;
                for(int k = j; k < len; k++) {
                    b ^= arr[k];
                    if(a == b) {
                        count++;
                    }
                }
            }
        }
        
        return count;
    }
}