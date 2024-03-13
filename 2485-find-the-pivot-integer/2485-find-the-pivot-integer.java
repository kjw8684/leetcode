class Solution {
    public int pivotInteger(int n) {
        int front_sum = 1, back_sum = 0;
        
        for(int i = 1; i < n; i++){
            back_sum += i;
        }
        back_sum += n;
        
        if(front_sum == back_sum) {
            return 1;
        }
        
        for(int i = 1; i < n; i++) {
            front_sum += i + 1;
            back_sum -= i;
            if(front_sum == back_sum){
                return i + 1;
            }
        }
       
        return -1;
    }
}