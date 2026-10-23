class Solution {
    public int sortPermutation(int[] nums) {
        int len = nums.length, unsort = -1;

        for(int i = 0; i < len; i++) {
            if(nums[i] != i) {
                if(unsort == -1) {
                    unsort = i;
                }
                else {
                    unsort &= i;
                }
            }
        }

        if(unsort == -1) {
            return 0;
        }

        return unsort;
    }
}