class Solution {
    public int possibleStringCount(String word) {
        int answer = 1, len = word.length();
        char before = word.charAt(0);

        for(int i = 1; i < len; i++) {
            if(before == word.charAt(i)) {
                answer++;
            }
            before = word.charAt(i);
        }

        return answer;
    }
}