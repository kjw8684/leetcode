class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] alpha = new int[26];

        for(char cur : text.toCharArray()) {
            alpha[cur - 'a']++;
        }
        
        int min = alpha[0];

        min = Math.min(min, alpha[1]);
        min = Math.min(min, alpha[13]);
        min = Math.min(min, alpha[11] / 2);
        min = Math.min(min, alpha[14] / 2);

        return min;
    }
}