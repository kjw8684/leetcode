class Solution {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        int answer = 0, len = s.length();

        for(int i = 0; i < len; i++) {
            answer *= 2;
            if(s.charAt(i) == '0') {
                answer += 1;
            }
        }

        return answer;
    }
}