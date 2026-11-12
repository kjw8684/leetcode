class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max = 1, count = 1, before = nums[0], dirc = 0;

        for(int num : nums) {
            if(before < num) {
                if(dirc == 1) {
                    count++;
                }
                else {
                    dirc = 1;
                    count = 2;
                }
            }
            else if(before > num) {
                if(dirc == -1) {
                    count++;
                }
                else {
                    dirc = -1;
                    count = 2;
                }
            }
            else {
                dirc = 0;
                count = 1;
            }

            before = num;
            max = Math.max(max, count);
        }

        return max;
    }
}