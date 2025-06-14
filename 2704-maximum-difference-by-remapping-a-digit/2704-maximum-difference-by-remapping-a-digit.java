class Solution {
    public int minMaxDifference(int num) {
        int len = (int)Math.log10(num) + 1;
        int[] digit = new int[len];

        for(int i = len - 1; i >= 0; i--) {
            digit[i] = num % 10;
            num /= 10;
        }

        int changeMax = 9, changeMin = digit[0];

        for(int i = 0; i < len; i++) {
            if(digit[i] != 9) {
                changeMax = digit[i];
                break;
            }
        }
        
        int answer = 0, curMax = -1, curMin = -1;

        for(int i = 0; i < len; i++) {
            answer *= 10;
            curMax = digit[i];
            curMin = digit[i];
            if(digit[i] == changeMax) {
                curMax = 9;
            }
            if(digit[i] == changeMin) {
                curMin = 0;
            }

            answer += curMax - curMin;
        }

        return answer;
    }
}