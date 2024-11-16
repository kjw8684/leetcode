class Solution {
    public int[] resultsArray(int[] nums, int k) {
        if(k == 1) return nums;
        int len = nums.length, not_in_order = -1, index = 0;
        int[] answer = new int[len - k + 1];

        for(int i = 1; i < k - 1; i++) {
            if(nums[i] != nums[i - 1] + 1) {
                not_in_order = i;
            }
        }

        for(int i = k - 1; i < len; i++, index++) {
            if(nums[i] != nums[i - 1] + 1) {
                not_in_order = i;
            }

            if(i - not_in_order + 1 >= k) {
                answer[index] = nums[i];
            }
            else {
                answer[index] = -1;
            }
        }

        return answer;
    }
}