class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int max = 0;
        Arrays.sort(arr);

        for(int num : arr) {
            if(max < num) {
                max++;
            }
        }

        return max;
    }
}