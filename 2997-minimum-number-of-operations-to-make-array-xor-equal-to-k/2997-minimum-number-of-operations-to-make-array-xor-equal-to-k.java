class Solution {
    public int minOperations(int[] nums, int k) {
        int len = nums.length, answer = nums[0], count = 0;
        
        for(int i = 1; i < len; i++) {
            answer ^= nums[i];
        }
        
        StringBuilder bstring1 = new StringBuilder(Integer.toBinaryString(answer)), bstring2 = new StringBuilder(Integer.toBinaryString(k));
        len = Math.max(bstring1.length(), bstring2.length());
        
        while(bstring1.length() != bstring2.length()) {
            if(bstring1.length() < len) {
                bstring1.insert(0, "0");
            }
            else{
                bstring2.insert(0, "0");
            }
        }
        
        for(int i = 0; i < len; i++) {
            if(bstring1.charAt(i) != bstring2.charAt(i)) {
                count++;
            }
        }
        
        return count;
    }
}