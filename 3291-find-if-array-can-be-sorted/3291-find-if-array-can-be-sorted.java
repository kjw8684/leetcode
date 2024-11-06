class Solution {
    public boolean canSortArray(int[] nums) {
        boolean cheak = true;
        int len = nums.length, max = 0, cur_max = 0, set = 0;
        
        for(int i = 0; i < len; i++) {
            if(set != Integer.bitCount(nums[i])) {
                if(max > cur_max) {
                    return false;
                }
                set = Integer.bitCount(nums[i]);
                max = cur_max;
                cur_max = nums[i];
            }
            else {
                cur_max = Math.max(cur_max, nums[i]);
            }
            if(max > nums[i]) {
                return false;
            }
        }

        return max < cur_max;
    }
}