class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sum = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, sum, 0, nums1.length);
        System.arraycopy(nums2, 0, sum, nums1.length, nums2.length);
        Arrays.sort(sum);
        if(sum.length % 2 == 0){
            double Answer = sum[sum.length / 2] + sum[(sum.length / 2) - 1];
            return Answer / 2;
        }
        else{
            return sum[(sum.length - 1) / 2];
        }
    }
}