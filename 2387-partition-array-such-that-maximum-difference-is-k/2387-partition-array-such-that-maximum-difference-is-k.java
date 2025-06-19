class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length, count = 1, min = nums[0];

        for(int i = 1; i < len; i++) {
            if(nums[i] - min > k) {
                count++;
                min = nums[i];
            }
        }

        return count;
    }
}