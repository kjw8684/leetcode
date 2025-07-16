class Solution {
    public int maximumLength(int[] nums) {
        int len = nums.length, max = 1, before = nums[0], odd = 0, even = 0;

        for(int i = 1; i < len; i++) {
            if(before % 2 != nums[i] % 2) {
                max++;
                before = nums[i];
            }
        }

        for(int num : nums) {
            if(num % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }

        max = Math.max(max, Math.max(odd, even));

        return max;
    }
}