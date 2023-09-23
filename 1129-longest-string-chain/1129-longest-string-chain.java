class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (String s1, String s2) -> s1.length() - s2.length());
        int[] pos = new int[words.length];
        for(int i = 0; i < pos.length; i++){
            pos[i] = 1;
        }
        for(int i = 0; i < words.length; i++){
            for(int j = i + 1; j < words.length; j++){
                if(words[i].length() == words[j].length()){
                    continue;
                }else if(words[i].length() + 1 != words[j].length()){
                    break;
                }
                if(counting(words[i], words[j])){
                    if(pos[j] < pos[i] + 1){
                        pos[j] = pos[i] + 1;
                    }
                }
            }
        }
        Arrays.sort(pos);
        return pos[pos.length - 1];
    }
    public boolean counting(String word1, String word2){
        int count = 0;
        for(int i = 0; i < word2.length(); i++){
            if(word2.charAt(i) == word1.charAt(count)){
                count++;
            }
            if(count == word1.length()){
                break;
            }
        }
        return count == word1.length();
    }
}