class Solution {
    public int countBinarySubstrings(String s) {
        int len = s.length(), count = 0, stack = 1, prev = 1;

        for(int i = 1; i < len; i++) {
            if(s.charAt(i) == s.charAt(i - 1)) {
                stack++;
            }
            else {
                prev = stack;
                stack = 1;
            }

            if(stack <= prev) {
                count++;
            }
        }

        return count;
    }
}