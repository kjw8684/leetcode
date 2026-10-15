class Solution {
    public int sumCounts(List<Integer> nums) {
        int len = nums.size(), sum = 0;
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < len; i++) {
            set.clear();
            for(int j = i; j < len; j++) {
                set.add(nums.get(j));
                sum += Math.pow(set.size(), 2);
            }
        }

        return sum;
    }
}