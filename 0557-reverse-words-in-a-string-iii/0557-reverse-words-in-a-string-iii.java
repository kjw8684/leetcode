class Solution {
    public String reverseWords(String s) {
        String temp = "";
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            boolean is_not_blank = s.charAt(i) != ' ';
            if (is_not_blank) {
                temp = s.charAt(i) + temp;
            }else {
                answer.append(temp);
                answer.append(" ");
                temp = "";
            }
        }
        answer.append(temp);
        return answer.toString();
    }
}