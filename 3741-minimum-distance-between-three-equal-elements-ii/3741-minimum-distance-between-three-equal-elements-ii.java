class Solution {
    public int minimumDistance(int[] nums) {
        int len = nums.length, min = 500000;
        Map<Integer, Queue<Integer>> map = new HashMap<>();

        for(int i = 0; i < len; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], new LinkedList<>());
                map.get(nums[i]).add(i);
            }
            else {
                map.get(nums[i]).add(i);
                if(map.get(nums[i]).size() > 2) {
                    min = Math.min(min, (i - map.get(nums[i]).poll()) * 2);
                }
            }
        }

        if(min == 500000) {
            return -1;
        }

        return min;
    }
}