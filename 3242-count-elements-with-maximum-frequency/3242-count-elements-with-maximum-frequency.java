class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 1, len = nums.length, current = 0, answer = 0, value = 0;
        
        for(int i = 0; i < len; i++) {
            current = nums[i];
            if(map.get(current) == null) {
                map.put(current, 1);
                continue;
            }
            
            value = map.get(current) + 1;
            if (max < value) {
                max = value;
            }
            
            map.put(current, value);
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == max) {
                answer += max;
            }
        }
        
        return answer;
    }
}