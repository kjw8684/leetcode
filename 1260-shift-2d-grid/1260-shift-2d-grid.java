class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row = grid[0].length, col = grid.length, all = row * col;
        k %= all;
        k = all - k;
        List<List<Integer>> answer = new ArrayList<>();

        for(int i = 0; i < col; i++) {
            answer.add(new ArrayList<>());
            for(int j = 0; j < row; j++) {
                answer.get(i).add(grid[k % all / row][k % all % row]);
                k++;
            }
        }

        return answer;
    }
}