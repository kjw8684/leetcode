class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int cur = nums[0];

        for(int num : nums) {
            while(cur != num) {
                list.add(cur);
                cur++;
            }
            cur++;
        }

        return list;
    }
}