class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean incresing = true, decreasing = true;
        if (nums.length == 1) {
            return true;
        } else {
            for (int i = 0; i < nums.length - 1 && (incresing || decreasing); i++) {
                boolean array_is_decreasing = nums[i] < nums[i + 1] && decreasing;
                if (array_is_decreasing) {
                    decreasing = false;
                }
                
                boolean array_is_incresing =nums[i] > nums[i + 1] && incresing;
                if (array_is_incresing) {
                    incresing = false;
                }
            }

            return incresing || decreasing;
        }
    }
}