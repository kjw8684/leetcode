class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int len = moves.length(), answer_r = 0, answer_l = 0;
        boolean right = true;

        for(int i = 0; i < len; i++) {
            char cur = moves.charAt(i);
            if(cur == 'L') {
                right = false;
            }
            else if(cur == 'R') {
                right = true;
            }
            else {
                right = true;
            }

            if(right) {
                answer_r++;
            }
            else {
                answer_r--;
            }
        }

        right = false;
        for(int i = 0; i < len; i++) {
            char cur = moves.charAt(i);
            if(cur == 'L') {
                right = false;
            }
            else if(cur == 'R') {
                right = true;
            }
            else {
                right = false;
            }

            if(right) {
                answer_l++;
            }
            else {
                answer_l--;
            }
        }

        return Math.max(Math.abs(answer_r), Math.abs(answer_l));
    }
}