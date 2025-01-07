class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        int len = words.length;

        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(i == j) {
                    continue;
                }
                if(words[j].contains(words[i])) {
                    list.add(words[i]);
                    break;
                }
            }
        }

        return list;
    }
}