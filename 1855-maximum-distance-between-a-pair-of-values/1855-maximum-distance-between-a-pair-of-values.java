class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int max = 0, right = 1, len1 = nums1.length, len2 = nums2.length;

        for(int i = 0; i < len1; i++) {
            for(int j = Math.max(right, max + i + 1); j < len2; j++) {
                if(nums1[i] <= nums2[j] && max < j - i) {
                    max = j - i;
                    right = j;
                }
                else if(nums1[i] > nums2[j]) {
                    break;
                }
            }
        }

        return max;
    }
}