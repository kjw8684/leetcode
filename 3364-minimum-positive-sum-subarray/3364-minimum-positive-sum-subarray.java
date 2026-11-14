class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int len = nums.size(), min = Integer.MAX_VALUE;

        for(int i = l; i <= r; i++) {
            int sum = 0;
            for(int j = 0; j < i; j++) {
                sum += nums.get(j);
            }

            if(sum > 0) {
                min = Math.min(min, sum);
            }

            for(int j = i; j < len; j++) {
                sum += nums.get(j);
                sum -= nums.get(j - i);
                if(sum > 0) {
                    min = Math.min(min, sum);
                }
            }
        }

        if(min == Integer.MAX_VALUE) {
            return -1;
        }

        return min;
    }
}