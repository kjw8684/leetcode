class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] split = sentence.split(" ");
        char first = split[0].charAt(0), last = split[0].charAt(split[0].length() - 1);
        int len = split.length;

        for(int i = 1; i < len; i++) {
            first = split[i].charAt(0);
            if(first != last) {
                return false;
            }
            last = split[i].charAt(split[i].length() - 1);
        }

        return split[0].charAt(0) == last;
    }
}