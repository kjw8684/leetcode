class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = -1, end = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (start == -1) {
                    start = i;
                }

                boolean next_isnt_same = i + 1 < nums.length && nums[i + 1] != target && start != -1;
                if (next_isnt_same) {
                    end = i;
                    break;
                }
            }
        }
        
        return start != -1 && end == -1 ? new int[] {start, nums.length - 1} : new int[] {start, end};
    }
}