class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int len = nums.length, answer = len + 1;
        Map<Integer, Integer> map = new HashMap<>();

        map.put(reverse(nums[0]), 0);

        for(int i = 1; i < len; i++) {
            if(map.containsKey(nums[i])) {
                answer = Math.min(answer, i - map.get(nums[i]));
            }
            map.put(reverse(nums[i]), i);
        }

        if(answer == len + 1) {
            return -1;
        }
        return answer;
    }

    public int reverse(int n) {
        int answer = 0;

        while(n != 0) {
            answer *= 10;
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}