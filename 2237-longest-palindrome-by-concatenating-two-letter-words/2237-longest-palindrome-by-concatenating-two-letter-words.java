class Solution {
    public int longestPalindrome(String[] words) {
        int first = -1, second = -1, answer = 0;
        int[][] count = new int[26][26];

        for(String word : words) {
            first = word.charAt(0) - 'a';
            second = word.charAt(1) - 'a';

            if(count[second][first] > 0) {
                answer += 4;
                count[second][first]--;
            }
            else {
                count[first][second]++;
            }
        }

        for(int i = 0; i < 26; i++) {
            if(count[i][i] > 0) {
                answer += 2;
                break;
            }
        }

        return answer;
    }
}