class Solution {
    public int smallestIndex(int[] nums) {
        int len = nums.length;

        for(int i = 0; i < len; i++) {
            if(check(i, nums[i])) {
                return i;
            }
        }

        return -1;
    }

    private boolean check(int i, int num) {
        int cur = 0;

        while(num != 0) {
            cur += num % 10;
            num /= 10;
        }

        return cur == i;
    }
}