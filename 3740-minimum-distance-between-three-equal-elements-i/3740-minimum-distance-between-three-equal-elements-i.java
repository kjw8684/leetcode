class Solution {
    public int minimumDistance(int[] nums) {
        int len = nums.length, min = 500;
        int[][] count = new int[101][4];

        for(int i = 0; i < len; i++) {
            count[nums[i]][0]++;

            if(count[nums[i]][0] > 2) {
                count[nums[i]][1] = count[nums[i]][2];
                count[nums[i]][2] = count[nums[i]][3];
                count[nums[i]][3] = i;
                min = Math.min(min, (count[nums[i]][3] - count[nums[i]][1]) * 2);
            }
            else {
                count[nums[i]][count[nums[i]][0] + 1] = i;
            }
        }

        if(min == 500) {
            return -1;
        }

        return min;
    }
}