class Solution {
    public int countHillValley(int[] nums) {
        int count = 0, start = 1, len = nums.length;
        boolean up = true;
        while(start < len) {
            if(nums[start] != nums[start - 1]) {
                if(nums[start] > nums[start - 1]) {
                    up = false;
                }
                break;
            }

            start++;
        }

        for(int i = start + 1; i < len; i++) {
            if(up && nums[i] > nums[i - 1]) {
                up = false;
                count++;
            }
            else if(!up && nums[i] < nums[i - 1]) {
                up = true;
                count++;
            }
        }

        return count;
    }
}