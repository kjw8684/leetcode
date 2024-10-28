class Solution {
    public int longestSquareStreak(int[] nums) {
        Set<Long> set = new HashSet<>();
        Set<Long> visited = new HashSet<>();
        int len = nums.length, max = -1, count = 0;
        Long cur = 0L;

        Arrays.sort(nums);

        for(int i = 0; i < len; i++) {
            set.add((long) nums[i]);
        }

        for(int i = 0; i < len; i++) {
            cur = (long) nums[i];
            count = 1;
            while(!visited.contains(cur) && set.contains(cur * cur)) {
                count++;
                visited.add(cur);
                cur *= cur;
            }
            max = Math.max(max, count);
        }

        if(max < 2) {
            return -1;
        }

        return max;
    }
}