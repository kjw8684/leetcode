class Solution {
    //1 2 3 3 4 5 6 7 7 8 7 9

    //o x x o o o x x x o

    //0 0 0 1 1 0 0 0 1 1 1 0
    public long maximumSubarraySum(int[] nums, int k) {
        long max = 0, sum = 0;
        int len = nums.length, dup = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < k; i++) {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if(map.get(nums[i]) > 1) {
                dup++;
            }
        }

        if(dup == 0) {
            max = Math.max(max, sum);
        }

        for(int i = k; i < len; i++) {
            if(map.get(nums[i - k]) > 1) {
                dup--;
            }
            sum -= nums[i - k];
            map.put(nums[i - k], map.get(nums[i - k]) - 1);

            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if(map.get(nums[i]) > 1) {
                dup++;
            }

            if(dup == 0) {
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}