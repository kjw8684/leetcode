class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] split = text.split(" ");
        int len = brokenLetters.length(), answer = 0;

        for(String now : split) {
            boolean check = true;
            for(int i = 0; i < len; i++) {
                String cur = "" + brokenLetters.charAt(i);
                if(now.contains(cur)) {
                    check = false;
                    break;
                }
            }

            if(check) {
                answer++;
            }
        }
        
        return answer;
    }
}