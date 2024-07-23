class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        Integer[] sorting = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        for(int i = 0; i < len; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        Arrays.sort(sorting, (a, b) -> {
            int p1 = map.get(a), p2 = map.get(b);
            if(p1 == p2) {
                return b - a;
            }
            return Integer.compare(p1, p2);
        });

        return Arrays.stream(sorting).mapToInt(Integer::intValue).toArray();
    }
}