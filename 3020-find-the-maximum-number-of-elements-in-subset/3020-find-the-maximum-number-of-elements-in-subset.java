class Solution {
    public int maximumLength(int[] nums) {
        int max = 1;
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> dp = new HashMap<>();
        Arrays.sort(nums);

        for(int num : nums) {
            int sqrt = (int)Math.sqrt(num);
            if(num == 1) {
                count.put(num, count.getOrDefault(num, 0) + 1);
                dp.put(num, 1);
            }
            else if(Math.sqrt(num) == sqrt && count.getOrDefault(sqrt, 0) >= 2) {
                count.put(num, count.getOrDefault(num, 0) + 1);
                dp.put(num, dp.getOrDefault((int)Math.sqrt(num), -1) + 2);
            }
            else {
                count.put(num, count.getOrDefault(num, 0) + 1);
                dp.put(num, 1);
            }

            max = Math.max(max, dp.get(num));
        }

        int one = count.getOrDefault(1, 0);
        if(one % 2 == 0) {
            one -= 1;
        }

        if(one > max) {
            return one;
        }

        return max;
    }
}