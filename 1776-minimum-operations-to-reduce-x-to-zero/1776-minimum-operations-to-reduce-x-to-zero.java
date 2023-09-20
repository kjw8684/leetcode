class Solution {
    public int minOperations(int[] nums, int x) {
        int target = -x;
        for(int num : nums){
           target += num;
        }
        if(target == 0){
            return nums.length;
        }
        int max = 0, sum = 0, left = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            while(left <= i && sum > target){
                sum -= nums[left];
                left++;
            }
            if(sum == target){
                max = Math.max(max, i - left + 1);
            }
        }
        return max != 0 ? nums.length - max : -1;
    }
}