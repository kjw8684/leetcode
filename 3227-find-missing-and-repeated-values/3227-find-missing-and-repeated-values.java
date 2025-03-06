class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int size = grid.length * grid.length;
        int[] count = new int[size];
        int[] answer = new int[2];

        for(int[] curArray : grid) {
            for(int cur : curArray) {
                count[cur - 1]++;
            }
        }

        for(int i = 0; i < size; i++) {
            if(count[i] == 2) {
                answer[0] = i + 1;
            }
            if(count[i] == 0) {
                answer[1] = i + 1;
            }
        }

        return answer;
    }
}