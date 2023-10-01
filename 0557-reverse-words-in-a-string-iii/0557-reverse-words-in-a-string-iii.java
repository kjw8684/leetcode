class Solution {
    int starting_point = 0;
    StringBuilder answer = new StringBuilder(), temp = new StringBuilder();

    public String reverseWords(String s) {
        for (int i = 0; i < s.length(); i++) {
            boolean is_blank = s.charAt(i) == ' ';
            if (is_blank) {
                insert(s, i);
            }
        }
        last_insert(s);

        return answer.toString();
    }

    private void insert(String s, int i) {
        temp.append(s.substring(starting_point, i));
        answer.append(temp.reverse());
        answer.append(" ");
        temp.setLength(0);
        starting_point = i + 1;
    }

    private void last_insert(String s) {
        temp.append(s.substring(starting_point));
        answer.append(temp.reverse());
    }
}