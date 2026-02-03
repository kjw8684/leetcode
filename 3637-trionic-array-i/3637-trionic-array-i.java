class Solution {
    public boolean isTrionic(int[] nums) {
        int len = nums.length;
        boolean up = false, down = false, check = false;

        for(int i = 1; i < len; i++) {
            if(!check && up && nums[i] < nums[i - 1]) {
                down = true;
            }
            else if(nums[i] > nums[i - 1]) {
                if(down) {
                    check =  true;
                }
                up = true;
            }
            else {
                return false;
            }
        }

        return check;
    }
}