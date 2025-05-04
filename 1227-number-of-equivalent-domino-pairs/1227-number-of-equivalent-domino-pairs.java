class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int len = dominoes.length, count = 0;
        int[][] dominoe = new int[9][9];

        for(int i = 0; i < len; i++) {
            if(dominoes[i][0] > dominoes[i][1]) {
                dominoe[dominoes[i][0] - 1][dominoes[i][1] - 1]++;
            }
            else {
                dominoe[dominoes[i][1] - 1][dominoes[i][0] - 1]++;
            }
        }

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j <= i; j++) {
                if(dominoe[i][j] > 1) {
                    count += C(dominoe[i][j]);
                }
            }
        }

        return count;
    }

    public int C(int value) {
        int answer = 1;

        for(int i = value; i > value - 2; i--) {
            answer *= i;
        }

        return answer / 2;
    }
}