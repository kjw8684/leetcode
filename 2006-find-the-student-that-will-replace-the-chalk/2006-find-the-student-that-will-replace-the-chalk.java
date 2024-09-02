class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int len = chalk.length, index = 0, sum = 0;
        
        for(int i = 0; i < len; i++) {
            sum += chalk[i];
            if(sum > k) {
                return i;
            }
            if(sum == k) {
                return i + 1 != len ? i : 0;
            }
        }
        k %= sum;
        
        while(k > 0) {
            if(index == len) {
                index = 0;
            }
            k -= chalk[index];
            index++;
        }

        return k == 0 ? (index == len ? 0 : index) : index - 1;
    }
}