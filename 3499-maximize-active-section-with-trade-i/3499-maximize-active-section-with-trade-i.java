class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int before = 0, after = 0, count = 0, max = 0;

        for(char cur : s.toCharArray()) {
            if(cur == '0') {
                after++;
                if(before != 0) {
                    max = Math.max(max, before + after);
                }
            }
            else {
                count++;
                if(after != 0) {
                    before = after;
                    after = 0;
                }
            }
        }

        return count + max;
    }
}