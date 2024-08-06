class Solution {
    public int minimumPushes(String word) {
        Integer[] counting = new Integer[26];
        Arrays.fill(counting, 0);
        int len = word.length(), count = 0, number = 1, answer = 0;

        for(int i = 0; i < len; i++) {
            counting[word.charAt(i) - 'a']++;
        }

        Arrays.sort(counting, Collections.reverseOrder());

        for(int i = 0; i < 26; i++) {
            if(counting[i] == 0) {
                break;
            }
            answer += counting[i] * number;
            count++;
            if(count == 8) {
                count = 0;
                number++;
            }
        }

        return answer;
    }
}