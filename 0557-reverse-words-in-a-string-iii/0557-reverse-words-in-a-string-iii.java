class Solution {
    public String reverseWords(String s) {
        int starting_point = 0;
        StringBuilder answer = new StringBuilder(), temp = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            boolean is_blank = s.charAt(i) == ' ';
            if (is_blank) {
                temp.append(s.substring(starting_point, i));
                answer.append(temp.reverse());
                answer.append(" ");
                temp.setLength(0);
                starting_point = i + 1;
            }
        }
        temp.append(s.substring(starting_point));
        answer.append(temp.reverse());

        return answer.toString();
    }
}