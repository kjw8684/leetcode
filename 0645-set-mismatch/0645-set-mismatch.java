class Solution {
    public int[] findErrorNums(int[] nums) {
        int len = nums.length, twice = 0, count = 1;
        Arrays.sort(nums);

        for(int i = 0; i < len; i++) {
            if (count == nums[i]) {
                count++;
            }

            if (i != len - 1 && nums[i] == nums[i + 1]) {
                twice = nums[i];
            }
        }

        return new int[] {twice, count};
    }
}