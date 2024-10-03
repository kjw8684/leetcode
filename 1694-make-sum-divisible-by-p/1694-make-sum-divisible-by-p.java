class Solution {
    public int minSubarray(int[] nums, int p) {
        int rem = 0, len = nums.length, pre = 0, res = len;
        for (int x : nums) {
            rem = (rem + x) % p;
        }
        if (rem == 0) {
            return 0;
        }

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < len; ++i) {
            pre = (pre + nums[i]) % p;
            if (map.containsKey((pre - rem + p) % p) ) {
                res = Math.min(res, i - map.get((pre - rem + p) % p));
            }
            map.put(pre, i);
        }
        return res == nums.length ? -1 : res;
    }
}