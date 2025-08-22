class Solution {
    public String largestGoodInteger(String num) {
        int len = num.length();
        String answer = "";
        char max = '/';

        for(int i = 2; i < len; i++) {
            char first = num.charAt(i - 2), second = num.charAt(i - 1), third = num.charAt(i);
            if(first == second && first == third && max < first) {
                max = first;
                answer = num.substring(i - 2, i + 1);
            }
        }

        return answer;
    }
}