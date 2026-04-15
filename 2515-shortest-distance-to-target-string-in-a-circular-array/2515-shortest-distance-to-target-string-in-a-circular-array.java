class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int len = words.length;
        for(int i = 0; i < len; i++) {
            if(words[(len + startIndex - i) % len].equals(target)) {
                return i;
            }
            if(words[(startIndex + i) % len].equals(target)) {
                return i;
            }
        }

        return -1;
    }
}