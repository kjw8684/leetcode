class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        boolean cheak = false;

        for(int num : nums) {
            if(num >= 0 && !set.contains(num)) {
                sum += num;
                set.add(num);
                cheak = true;
            }
        }

        if(cheak) {
            return sum;
        }
        Arrays.sort(nums);

        return nums[nums.length - 1];
    }
}