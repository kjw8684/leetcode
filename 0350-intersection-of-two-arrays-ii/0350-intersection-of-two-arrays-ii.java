class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> answer = new ArrayList<>();
        int len1 = nums1.length, len2 = nums2.length, index = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        for(int i = 0; i < len1 && index < len2; i++) {
            if(nums1[i] == nums2[index]) {
                answer.add(nums1[i]);
                index++;
            }
            else if(nums1[i] > nums2[index]) {
                i--;
                index++;
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}