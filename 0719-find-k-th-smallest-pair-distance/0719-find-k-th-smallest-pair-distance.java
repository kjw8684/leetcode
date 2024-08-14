class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        int len = nums.length;
        int[] map = new int[1000000];

        for(int i = 0; i < len; i++) {
            for(int j = i + 1; j < len; j++) {
                map[Math.abs(nums[i] - nums[j])]++;
            }
        }

        for(int i = 0; i < 1000000; i++) {
            if(k <= map[i]) {
                return i;
            }
            k-= map[i];
        }

        return 0;
    }
}