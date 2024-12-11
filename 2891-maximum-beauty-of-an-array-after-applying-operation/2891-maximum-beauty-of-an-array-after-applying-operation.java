class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length, max = 1, start_index = 0, end_index = 1;
        k *= 2;

        for(start_index = 0; start_index < len; start_index++) {
            for( ; end_index < len; end_index++) {
                if(nums[end_index] - k > nums[start_index]) {
                    break;
                }
            }

            max = Math.max(max, end_index - start_index);

            if(max > len - start_index) {
                break;
            }
        }

        return max;
    }
}