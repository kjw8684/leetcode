class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int len = nums.length, leftPointer = 0, rightPointer = 0, max = 0;

        Set<Integer> set = new HashSet<>();
        int left = 0, right = 0;
        while(rightPointer < len) {
            while(!set.contains(nums[rightPointer])) {
                set.add(nums[rightPointer]);
                right += nums[rightPointer];
                rightPointer++;
                if(rightPointer == len) {
                    break;
                }
            }
            max = Math.max(max, right - left);
            if(rightPointer == len) {
                break;
            }

            while(set.contains(nums[rightPointer])) {
                set.remove(nums[leftPointer]);
                left += nums[leftPointer];
                leftPointer++;
            }
        }

        return max;
    }
}