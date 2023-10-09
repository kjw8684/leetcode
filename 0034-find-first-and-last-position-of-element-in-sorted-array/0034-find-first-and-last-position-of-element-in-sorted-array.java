class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = -1, end = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (start == -1) {
                    start = i;
                }
                
                if (i + 1 < nums.length && nums[i + 1] != target && start != -1) {
                    end = i;
                    break;
                }
            }
        }

        if (start != -1 && end == -1) {
            end = nums.length - 1;
        }

        return new int[] {start, end};
    }
}