class Solution {
    public int minimumDeletions(int[] nums) {
        int len = nums.length, min = 100001, max = -100001, min_index = -1, max_index = -1;

        for(int i = 0; i < len; i++) {
            if(min > nums[i]) {
                min = nums[i];
                min_index = i;
            }
            if(max < nums[i]) {
                max = nums[i];
                max_index = i;
            }
        }

        if(min_index > max_index) {
            int temp = min_index;
            min_index = max_index;
            max_index = temp;
        }

        return Math.min(len - max_index + min_index + 1, Math.min(len - min_index, max_index + 1));
    }
}