class Solution {
    public int tupleSameProduct(int[] nums) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < len; i++) {
            for(int j = i + 1; j < len; j++) {
                int cur = nums[i] * nums[j];
                if(map.containsKey(cur)) {
                    map.compute(cur, (key, value) -> value + 1);
                }
                else {
                    map.put(cur, 1);
                }
            }
        }

        int answer = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int cur = entry.getValue();
            if(cur > 1) {
                answer += 8 * cur * (cur - 1) / 2;
            }
        }

        return answer;
    }
}