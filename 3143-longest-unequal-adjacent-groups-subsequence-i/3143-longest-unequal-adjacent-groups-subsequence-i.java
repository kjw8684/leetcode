class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        int len = groups.length, before = -1;
        List<String> answer = new ArrayList<>();

        for(int i = 0; i < len; i++) {
            if(before != groups[i]) {
                answer.add(words[i]);
                before = groups[i];
            }
        }

        return answer;
    }
}