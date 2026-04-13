class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int len = nums.length, count = 0;

        while(start + count < len || start - count >= 0) {
            if(start + count < len && nums[start + count] == target) {
                return count;
            }
            if(start - count >= 0 && nums[start - count] == target){
                return count;
            }
            count++;
        }

        return -1;
    }
}