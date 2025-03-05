class Solution {
    public long coloredCells(int n) {
        long answer = 1;

        for(int i = 1; i < n; i++) {
            answer += 4 * i;
        }

        return answer;
    }
}