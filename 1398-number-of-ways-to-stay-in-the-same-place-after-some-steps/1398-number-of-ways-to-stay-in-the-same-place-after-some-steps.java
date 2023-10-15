import java.math.BigInteger;

class Solution {
    public int numWays(int steps, int arrLen) {
        if (arrLen == 1) {
            return 1;
        }
        if (arrLen > steps) {
            arrLen = steps;
        }
        BigInteger[][] answer = new BigInteger[steps + 1][arrLen];
        BigInteger fill = new BigInteger("0");
        for (int i = 0; i < steps + 1; i++) {
            Arrays.fill(answer[i], fill);
        }
        answer[0][0] = new BigInteger("1");

        for (int i = 1; i < steps + 1; i++) {
            for (int j = 0; j < arrLen; j++) {
                if (j < 1) {
                    answer[i][j] = answer[i][j].add(answer[i - 1][j]);
                    answer[i][j] = answer[i][j].add(answer[i - 1][j + 1]);
                }else if (j == arrLen - 1) {
                    answer[i][j] = answer[i][j].add(answer[i - 1][j - 1]);
                    answer[i][j] = answer[i][j].add(answer[i - 1][j]);
                }else {
                    answer[i][j] = answer[i][j].add(answer[i - 1][j - 1]);
                    answer[i][j] = answer[i][j].add(answer[i - 1][j]);
                    answer[i][j] = answer[i][j].add(answer[i - 1][j + 1]);
                }

                if (answer[i][j].equals("0")) {
                    break;
                }
            }
        }

        int answer_value = answer[steps][0].mod(new BigInteger("1000000007")).intValue();
        return answer_value;
    }
}