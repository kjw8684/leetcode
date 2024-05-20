class Solution {
    int sum = 0;
    public int subsetXORSum(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            cal(nums, i, 0);
        }
        return sum;
    }
    
    public void cal(int[] nums, int pos, int cur) {
        cur ^= nums[pos];
        sum += cur;
        for(int i = pos + 1; i < nums.length; i++) {
            cal(nums, i, cur);
        }
    }
}