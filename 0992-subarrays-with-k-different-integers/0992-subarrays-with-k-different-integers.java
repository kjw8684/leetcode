class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int len = nums.length, left = 0 ,right = 0, full = 0, leftover = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        while(right < len) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            
            while(map.size() > k) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;
            }
            
            full += right - left + 1;
            right++;
        }
        
        k--;
        right = 0;
        left = 0;
        map.clear();
        
        while(right < len) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            
            while(map.size() > k) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;
            }
            
            leftover += right - left + 1;
            right++;
        }
        
        return full - leftover;
    }
    
}