class Solution {
    public int missingMultiple(int[] nums, int k) {
        int cur = 1;
        Arrays.sort(nums);

        for(int num : nums) {
            if(k * cur == num) {
                cur++;
            }
            else if(k * cur < num) {
                break;
            }
        }

        return k * cur;
    }
}