class Solution {
    public int missingInteger(int[] nums) {
        int before = nums[0] - 1, sum = 0;
        for(int num : nums) {
            if(before + 1 == num) {
                sum += num;
            }
            else {
                break;
            }

            before = num;
        }
        Arrays.sort(nums);

        for(int num : nums) {
            if(num == sum) {
                sum++;
            }
        }

        return sum;
    }
}