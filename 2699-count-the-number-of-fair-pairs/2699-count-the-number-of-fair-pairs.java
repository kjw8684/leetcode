class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        int len = nums.length, low = 0, up = 0;
        long answer = 0;

        Arrays.sort(nums);
        
        for(int i = 0; i < len - 1; i++) {
            low = lowerBound(nums, i + 1, len, lower - nums[i]);
            up = upperBound(nums, i + 1, len, upper - nums[i]);
            answer += up - low;
        }

        return answer;
    }

    public int lowerBound(int[] nums, int start, int end, int target) {
        int mid = 0;
        while(start < end) {
            mid = start + (end - start) / 2;
            if(nums[mid] >= target) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }

        return start;
    }

    public int upperBound(int[] nums, int start, int end, int target) {
        int mid = 0;
        while(start < end) {
            mid = start + (end - start) / 2;
            if(nums[mid] > target) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }

        return start;
    }
}