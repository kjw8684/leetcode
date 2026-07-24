class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int len = nums.length;
        boolean[] two = new boolean[2049];
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < len; i++) {
            for(int j = i; j < len; j++) {
                two[nums[i] ^ nums[j]] = true;
            }
        }

        for(int i = 0; i < len; i++) {
            for (int j = 0; j < 2049; j++) {
                if(two[j]) {
                    set.add(nums[i] ^ j);
                }
            }
        }

        return set.size();
    }
}