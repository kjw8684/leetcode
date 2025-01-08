class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int len = words.length, count = 0;

        for(int i = 0; i < len; i++) {
            for(int j = i + 1; j < len; j++) {
                if(isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                }
            }
        }

        return count;
    }

    public boolean isPrefixAndSuffix(String str1, String str2) {
        int len1 = str1.length(), len2 = str2.length();
        if(len1 <= len2 && str1.equals(str2.substring(0, len1)) && str1.equals(str2.substring(len2 - len1, len2))) {
            return true;
        }

        return false;
    }
}