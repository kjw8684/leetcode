class Solution {
    public boolean uniformArray(int[] nums1) {
        int oddmin = Integer.MAX_VALUE, evenmin = Integer.MAX_VALUE;

        for(int num : nums1) {
            if(num % 2 == 0) {
                evenmin = Math.min(evenmin, num);
            }
            if(num % 2 == 1) {
                oddmin = Math.min(oddmin, num);
            }
        }

        if(evenmin == Integer.MAX_VALUE || oddmin == Integer.MAX_VALUE) {
            return true;
        }
        
        return evenmin > oddmin;
    }
}