class Solution {
    public int countPairs(int[] nums, int k) {
        int len = nums.length, count = 0;

        for(int i = 0; i < len; i++) {
            for(int j = i + 1; j < len; j++) {
                if((i * j) % k == 0 && nums[i] == nums[j]) {
                    count++;
                }
            }
        }

        return count;
    }
}