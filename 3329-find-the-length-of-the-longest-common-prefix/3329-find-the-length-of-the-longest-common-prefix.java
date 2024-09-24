class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        int max = 0, len1 = arr1.length, len2 = arr2.length;

        for(int i = 0; i < len1; i++) {
            while(arr1[i] != 0) {
                set.add(arr1[i]);
                arr1[i] /= 10;
            }
        }

        for(int i = 0; i < len2; i++) {
            while((int) Math.log10(arr2[i]) + 1 > max) {
                if(set.contains(arr2[i])) {
                    max = (int) Math.log10(arr2[i]) + 1;
                    break;
                }
                arr2[i] /= 10;
            }
        }

        return max;
    }
}