class Solution {
    public long countBadPairs(int[] nums) {
        long answer = 0;
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < len; i++) {
            if(!map.containsKey(nums[i] - i)) {
                map.put(nums[i] - i, 1);
            }
            else {
                map.compute(nums[i] - i, (key, value) -> value + 1);
            }
            
            answer += i - map.get(nums[i] - i) + 1;
        }

        return answer;
    }
}