class Solution {
    public List<Integer> getRow(int rowIndex) {
        int[][] answer = new int[rowIndex + 1][rowIndex + 1];
        for (int i = 0; i < rowIndex + 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0) {
                    answer[i][j] = 1;
                }else {
                    answer[i][j] = answer[i - 1][j - 1] + answer[i - 1][j];
                }
            }
        }

        return Arrays.asList(Arrays.stream(answer[rowIndex]).boxed().toArray(Integer[]::new));
    }
}