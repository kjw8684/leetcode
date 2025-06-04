class Solution {
    public String answerString(String word, int numFriends) {
        if(numFriends == 1) {
            return word;
        }
        int len = word.length(), max = 0;
        char maxValue = 'A';
        numFriends--;

        for(int i = 0; i < len; i++) {
            char cur = word.charAt(i);
            if(cur == maxValue) {
                for(int j = 1; j + i < len; j++) {
                    char before = word.charAt(max + j), challenger = word.charAt(i + j);
                    if(before < challenger) {
                        max = i;
                        maxValue = cur;
                        break;
                    }
                    else if(before > challenger) {
                        break;
                    }
                }
            }
            else if(cur > maxValue) {
                max = i;
                maxValue = cur;
            }
        }

        if(numFriends <= max) {
            return word.substring(max);
        }

        numFriends -= max;
        StringBuilder sb = new StringBuilder(word.substring(max));

        for(int i = 0; i < numFriends; i++) {
            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.toString();
    }
}