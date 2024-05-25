class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> answer = new ArrayList<>();
        
        search(answer, s, wordDict, 0, "");        
        
        return answer;
    }
    
    public void search(List<String> answer, String s, List<String> wordDict, int start, String current) {
        for(int i = start; i < s.length(); i++) {
            if(wordDict.contains(s.substring(start, i + 1))) {
                if(current.equals("")) {
                    search(answer, s, wordDict, i + 1, s.substring(start, i + 1));
                }
                else{
                    search(answer, s, wordDict, i + 1, current + " " + s.substring(start, i + 1));
                }
            }
        }
        
        if(start == s.length() && !current.equals("") && !answer.contains(current)) {
            answer.add(current);
        }
    }
}