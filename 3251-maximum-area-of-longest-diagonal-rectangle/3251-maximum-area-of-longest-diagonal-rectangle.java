class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max = 0, answer = 0;

        for(int[] dimension : dimensions) {
            int cur = dimension[0] * dimension[0] + dimension[1] * dimension[1];
            int area = dimension[0] * dimension[1];
            if(cur > max) {
                max = cur;
                answer = area;
            }
            else if(cur == max && area > answer) {
                answer = area;
            }
        }

        return answer;
    }
}