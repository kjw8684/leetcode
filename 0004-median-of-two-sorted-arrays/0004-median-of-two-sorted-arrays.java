class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sum = new int[nums1.length + nums2.length];
        for(int i = 0; i < nums1.length; i++){
            sum[i] = nums1[i];
        }
        for(int i = 0; i < nums2.length; i++){
            sum[i + nums1.length] = nums2[i];
        }
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