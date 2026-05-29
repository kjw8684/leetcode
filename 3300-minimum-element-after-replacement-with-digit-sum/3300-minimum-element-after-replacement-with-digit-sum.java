class Solution {
    public int minElement(int[] nums) {
        int min = 10000;

        for(int num : nums) {
            if(num >= 10) {
                int cur = 0;
                while(num != 0) {
                    cur += num % 10;
                    num /= 10;
                }
                num = cur;
            }

            min = Math.min(min, num);
        }

        return min;
    }
}