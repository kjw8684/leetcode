class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int len = nums.length, count = 0;

        for(int i = len - (len % 3); i < len; i++) {
            set.add(nums[i]);
        }

        if(set.size() < len % 3) {
            return (len + 3) / 3;
        }

        for(int i = len - (len % 3) - 1; i >= 0; i--) {
            set.add(nums[i]);

            if(i % 3 == 0 && set.size() < len - i) {
                return (i / 3) + 1;
            }
        }

        return 0;
    }
}