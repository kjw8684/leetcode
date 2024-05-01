class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int len = word.length(), index = 0;
        
        for(int i = 0; i < len; i++) {
            sb.insert(0, word.charAt(i));
            if(word.charAt(i) == ch) {
                index = i;
                break;
            }
        }
        
        if(index == 0) {
            return word;
        }

        sb.append(word.substring(index + 1, len));
        return sb.toString();
    }
}