class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int len = words.length;
        String X = Character.toString(x);
        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i < len; i++) {
            if(words[i].contains(X)) {
                answer.add(i);
            }
        }

        return answer;
    }
}