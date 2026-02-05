class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];

        for(int i = 0; i < len; i++) {
            result[i] = nums[((len * 100) + i + nums[i]) % len];
        }

        return result;
    }
}