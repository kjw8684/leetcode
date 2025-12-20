class Solution {
    public int minDeletionSize(String[] strs) {
        int len = strs[0].length();
        char[] before = new char[len];

        for(String str : strs) {
            for(int i = 0; i < len; i++) {
                char cur = str.charAt(i);
                if(before[i] <= cur) {
                    before[i] = cur;
                }
                else {
                    before[i] = '{';
                }
            }
        }

        int count = 0;
        for(char cur : before) {
            if(cur == '{') {
                count++;
            }
        }

        return count;
    }
}