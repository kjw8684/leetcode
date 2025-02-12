class Solution {
    public int maximumSum(int[] nums) {
        int len = nums.length, max = -1;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < len; i++) {
            int cur = digitSum(nums[i]);
            if(!map.containsKey(cur)) {
                map.put(cur, nums[i]);
            }
            else {
                int get = map.get(cur);
                max = Math.max(max, nums[i] + get);
                if(get < nums[i]) {
                    map.put(cur, nums[i]);
                }
            }
            
        }

        return max;
    }

    public static int digitSum(int a) {
        int answer = 0;

        while (a != 0) {
            answer += (a % 10);
            a /= 10;
        }

        return answer;
    }
}