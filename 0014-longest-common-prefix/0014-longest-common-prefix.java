class Solution {
    public String longestCommonPrefix(String[] strs) {
        String common = strs[0];
        int len = common.length();

        for(String str : strs) {
            if(str.length() < len) {
                len = str.length();
                common = common.substring(0, len);
            }
            while(str.substring(0, len).compareTo(common) != 0) {
                len--;
                common = common.substring(0, len);
            }
        }

        return common;
    }
}