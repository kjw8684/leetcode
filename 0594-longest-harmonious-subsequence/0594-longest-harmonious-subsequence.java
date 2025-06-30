class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int start = nums[0], len = nums.length, count1 = 1, count2 = 0, max = 0;
        boolean cheak = false;

        for(int i = 1; i < len; i++) {
            if(start == nums[i]) {
                count1++;
            }
            else if(start + 1 == nums[i]) {
                count2++;
                cheak = true;
            }
            else if(start + 2 == nums[i] && count2 != 0) {
                count1 = count2;
                count2 = 1;
                start++;
            }
            else {
                start = nums[i];
                count1 = 1;
                count2 = 0;
                cheak = false;
            }

            if(cheak) {
                max = Math.max(max, count1 + count2);
            }
        }

        return max;
    }
}