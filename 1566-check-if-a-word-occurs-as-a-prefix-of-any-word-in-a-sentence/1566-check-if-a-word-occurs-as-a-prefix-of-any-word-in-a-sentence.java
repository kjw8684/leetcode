class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] split = sentence.split(" ");
        int len = split.length, size = searchWord.length();

        for(int i = 0; i < len; i++) {
            if(split[i].length() >= size && split[i].substring(0, size).equals(searchWord)) {
                return i + 1;
            }
        }

        return -1;
    }
}