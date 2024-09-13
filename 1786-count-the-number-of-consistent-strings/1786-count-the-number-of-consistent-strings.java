class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] alpha = new boolean[26];
        int count = words.length, len = allowed.length(), index = 0;

        for(int i = 0; i < len; i++) {
            alpha[allowed.charAt(i) - 'a'] = true;
        }
        len = count;

        for(int i = 0; i < len; i++) {
            for(int j = 0; j < words[i].length(); j++) {
                if(!alpha[words[i].charAt(j) - 'a']) {
                    count--;
                    break;
                }
            }
        }

        return count;
    }
}