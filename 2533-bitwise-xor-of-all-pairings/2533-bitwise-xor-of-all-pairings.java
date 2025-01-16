class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length, num1 = 0, num2 = 0;

        if(len1 % 2 == 1) {
            for(int i = 0; i < len2; i++) {
                num2 ^= nums2[i];
            }
        }

        if(len2 % 2 == 1) {
            for(int i = 0; i < len1; i++) {
                num1 ^= nums1[i];
            }
        }

        return num1 ^ num2;
    }
}