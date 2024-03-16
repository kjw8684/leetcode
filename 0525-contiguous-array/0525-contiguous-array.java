class Solution {
    public int findMaxLength(int[] nums) {
        int max = 0, sum = 0, len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i = 0 ; i < len; i++) {
            if(nums[i] == 0) {
                sum--;
            }
            else{
                sum++;
            }
            
            if(!map.containsKey(sum)) {
                map.put(sum, i);
                continue;
            }
            
            if(max < i - map.get(sum)){
                max = i - map.get(sum);
            }
        }
        
        return max;
    }
}