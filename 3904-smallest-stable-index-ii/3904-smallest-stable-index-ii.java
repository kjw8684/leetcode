class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int len = nums.length;
        int[] max = new int[len];
        int[] min = new int[len];
        max[0] = nums[0];
        min[len - 1] = nums[len - 1];

        for(int i = 1; i < len; i++) {
            max[i] = Math.max(max[i - 1], nums[i]);
            min[len - i - 1] = Math.min(min[len - i], nums[len - i - 1]);
        }

        for(int i = 0; i < len; i++) {
            if(max[i] - min[i] <= k) {
                return i;
            }
        }

        return -1;
    }
}