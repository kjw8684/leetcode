class Solution {
    public int largestInteger(int[] nums, int k) {
        int len = nums.length;
        boolean first = true, last = true;

        if(k == 1) {
            int[] set = new int[51];

            for(int num : nums) {
                set[num]++;
            }

            for(int i = 50; i > 0; i--) {
                if(set[i] == 1) {
                    return i;
                }
            }

            return -1;
        }

        if(len <= k) {
            Arrays.sort(nums);
            return nums[len - 1];
        }

        if(nums[0] == nums[len - 1]) {
            return -1;
        }

        for(int i = 1; i < len - 1; i++) {
            if(nums[i] == nums[0]) {
                first = false;
            }
            if(nums[i] == nums[len - 1]) {
                last = false;
            }
        }

        if(first && last) {
            return Math.max(nums[0], nums[len - 1]);
        }
        else if(first) {
            return nums[0];
        }
        else if(last) {
            return nums[len - 1];
        }

        return -1;
    }
}