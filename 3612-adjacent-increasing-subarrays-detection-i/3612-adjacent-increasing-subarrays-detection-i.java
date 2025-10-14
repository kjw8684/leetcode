class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if(k == 1) {
            return true;
        }
        int len = nums.size(), count = 1, before = nums.get(0);
        boolean[] check = new boolean[len];

        for(int i = 1; i < len; i++) {
            if(nums.get(i) > before) {
                count++;
            }
            else {
                count = 1;
            }
            before = nums.get(i);

            if(count >= k) {
                check[i] = true;
            }

            if(i > k && check[i] && check[i - k]) {
                return true;
            }
        }

        return false;
    }
}