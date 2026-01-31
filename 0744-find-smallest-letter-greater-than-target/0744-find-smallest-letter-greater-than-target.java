class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char cur : letters) {
            if(target < cur) {
                return cur;
            }
        }

        return letters[0];
    }
}