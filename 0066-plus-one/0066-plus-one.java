class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        boolean up = true, over = false;

        for(int i = len - 1; up; i--) {
            if(i < 0) {
                over = true;
                break;
            }
            if(digits[i] == 9) {
                up = true;
                digits[i] = 0;
            }
            else {
                digits[i]++;
                up = false;
            }
        }

        if(over) {
            int[] answer = new int[len + 1];
            answer[0] = 1;
            return answer;
        }
        return digits;
    }
}