class Solution {
    int len = 0;
    public void backtrack(int[] nums, int index, int currentOR, int maxOR, int[] count) {
        if (currentOR == maxOR) {
            count[0]++;
        }

        for (int i = index; i < len; i++) {
            backtrack(nums, i + 1, currentOR | nums[i], maxOR, count);
        }
    }

    public int countMaxOrSubsets(int[] nums) {
        int max = 0;
        len = nums.length;

        for (int num : nums) {
            max |= num;
        }

        int[] count = new int[1];
        backtrack(nums, 0, 0, max, count);

        return count[0];
    }
}