class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duple = new HashSet<>();
        int len1 = nums1.length, len2 = nums2.length;
        
        for(int i = 0; i < len1; i++) {
            set.add(nums1[i]);
        }
        
        for (int i = 0; i < len2; i++) {
            if(set.contains(nums2[i]) && !duple.contains(nums2[i])) {
                duple.add(nums2[i]);
            }
        }
        
        int[] answer = new int[duple.size()];
        int index = 0;
        for (int num : duple) {
            answer[index++] = num;
        }
        
        return answer;
    }
}