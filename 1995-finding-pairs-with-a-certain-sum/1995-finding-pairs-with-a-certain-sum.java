class FindSumPairs {
    int[] nums1, nums2;
    Map<Integer, Integer> nums2Map = new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;

        for(int num : nums2) {
            if(nums2Map.containsKey(num)) {
                nums2Map.put(num, nums2Map.get(num) + 1);
            }
            else {
                nums2Map.put(num, 1);
            }
        }
    }
    
    public void add(int index, int val) {
        int target = nums2[index] + val;
        nums2Map.put(nums2[index], nums2Map.get(nums2[index]) - 1);

        if(nums2Map.containsKey(target)) {
            nums2Map.put(target, nums2Map.get(target) + 1);
        }
        else {
            nums2Map.put(target, 1);
        }
        
        nums2[index] += val;
    }
    
    public int count(int tot) {
        int answer = 0;
        for(int num : nums1) {
            int target = tot - num;
            if(nums2Map.containsKey(target)) {
                answer += nums2Map.get(target);
            }
        }

        return answer;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */