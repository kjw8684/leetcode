class Solution {
    public int repeatedNTimes(int[] nums) {
        int len = nums.length, count = 0, before = -1;
        Arrays.sort(nums);

        for(int num : nums) {
            if(before == num) {
                count++;
            }
            else {
                before = num;
                count = 1;
            }
            if(count == len / 2) {
                return num;
            }
        }

        return nums[0];
    }
}