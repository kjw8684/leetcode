class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int len = nums.size();
        int[] ans = new int[len];

        for(int i = 0; i < len; i++) {
            int cur = nums.get(i);
            ans[i] = -1;
            for(int j = 0; j < cur; j++) {
                if((j | (j + 1)) == cur) {
                    ans[i] = j;
                    break;
                }
            }
        }

        return ans;
    }
}