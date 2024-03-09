class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        int len1 = nums1.length, len2 = nums2.length;
        
        for(int i = 0; i < len1; i++) {
            set.add(nums1[i]);
        }
        
        for (int i = 0; i < len2; i++) {
            if(set.contains(nums2[i])) {
                return nums2[i];
            }
        }
        
        return -1;
    }
}