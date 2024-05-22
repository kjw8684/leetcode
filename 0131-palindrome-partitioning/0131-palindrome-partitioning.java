class Solution {
    List<List<String>> answer = new ArrayList<>();
    public List<List<String>> partition(String s) {
        List<String> current;
        StringBuilder sb;
        for(int i = 0; i < s.length(); i++) {
            current = new ArrayList<>();
            sb = new StringBuilder(s.substring(0, i + 1));
            if(sb.toString().equals(sb.reverse().toString())) {
                current.add(sb.toString());
                search(current, s, i + 1);
            }
        }
        
        return answer;
    }
    
    public void search(List<String> pre, String s, int cur) {
        if(cur == s.length()) {
            answer.add(pre);
            return;
        }
        List<String> current;
        StringBuilder sb;
        for(int i = cur; i < s.length(); i++) {
            current = new ArrayList<>(pre);
            sb = new StringBuilder(s.substring(cur, i + 1));
            if(sb.toString().equals(sb.reverse().toString())) {
                current.add(sb.toString());
                search(current, s, i + 1);
            }
        }
    }
}