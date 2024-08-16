class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0, len = s.length();
        Set<Character> set = new HashSet<>();
        boolean out = false;

        for(int i = 0; i < len; i++) {
            if(len - i < max)
                break;
            set.clear();
            out = false;
            for(int j = i; j < len; j++) {
                if(set.contains(s.charAt(j))) {
                    max = Math.max(max, j - i);
                    out = true;
                    break;
                }
                set.add(s.charAt(j));
            }
            if(!out) {
                max = len - i;
            }
        }

        return max;
    }
}