class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean incresing = true, decreasing = true;
        if (nums.length == 1) {
            return true;
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] < nums[i + 1] && decreasing) {
                    decreasing = false;
                }
                
                if (nums[i] > nums[i + 1] && incresing) {
                    incresing = false;
                }
            }

            return incresing || decreasing;
        }
    }
}