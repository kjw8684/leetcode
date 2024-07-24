class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        Integer[] sorting = Arrays.stream(nums).boxed().toArray(Integer[]::new);

         for(int i = 0; i < len; i++) {
            map.put(nums[i], making(mapping, nums[i]));
        }

        Arrays.sort(sorting, (a, b) -> {
            return Integer.compare(map.get(a), map.get(b));
        });

        return Arrays.stream(sorting).mapToInt(Integer::intValue).toArray();
    }

    public int making(int[] mapping, int target) {
        int temp = 0, digit = 0;

        if(target == 0) {
            return mapping[0];
        }

        while(target != 0) {
            temp += (mapping[target % 10] * Math.pow(10, digit));
            target /= 10;
            digit++;
        }

        return temp;
    }
}