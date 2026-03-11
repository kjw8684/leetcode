class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0) return 1;
        boolean[] digit = new boolean[32];
        int index = 0, answer = 0;

        while(n != 0) {
            if(n % 2 == 1) {
                digit[index] = false;
            }
            else {
                digit[index] = true;
            }
            n /= 2;
            index++;
        }

        for(int i = index; i >= 0; i--) {
            answer *= 2;
            if(digit[i]) {
                answer++;
            }
        }

        return answer;
    }
}