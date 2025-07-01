class Solution {
    public int possibleStringCount(String word) {
        int answer = 1, len = word.length();
        char before = word.charAt(0), current = '1';

        for(int i = 1; i < len; i++) {
            current = word.charAt(i);
            if(before == current) {
                answer++;
            }
            before = current;
        }

        return answer;
    }
}