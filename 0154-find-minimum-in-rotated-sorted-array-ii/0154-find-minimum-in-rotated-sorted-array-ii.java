class Solution {
    public int findMin(int[] nums) {
        int min = 5000;

        for(int num : nums) {
            min = Math.min(min, num);
        }

        return min;
    }
}