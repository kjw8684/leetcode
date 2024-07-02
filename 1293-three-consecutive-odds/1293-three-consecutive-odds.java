class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0, len = arr.length;
        
        for(int i = 0; i < len; i++) {
            if(arr[i] % 2 == 1) {
                count++;
            }
            else {
                count = 0;
            }
            
            if(count == 3) {
                return true;
            }
        }
        
        return false;
    }
}