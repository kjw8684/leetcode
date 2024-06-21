class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int len = customers.length, answer = 0, max = 0, curmax = 0;
        
        for(int i = 0; i < len; i++) {
            if(grumpy[i] == 0) {
                answer += customers[i];
            }
            else {
                curmax += customers[i];
            }
            if(i >= minutes && grumpy[i - minutes] == 1) {
                curmax -= customers[i - minutes];
            }
            max = Math.max(max, curmax);
        }
        
        return answer + max;
    }
}