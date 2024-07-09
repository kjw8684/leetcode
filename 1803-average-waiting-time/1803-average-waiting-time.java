class Solution {
    public double averageWaitingTime(int[][] customers) {
        int len = customers.length, cur = 1;
        double sum = 0;

        for(int i = 0; i < len; i++) {
            if(cur < customers[i][0]) {
                sum += customers[i][1];
                cur = customers[i][0] + customers[i][1];
            }
            else {
                sum += cur + customers[i][1] - customers[i][0];
                cur += customers[i][1];
            }
        }

        return sum / len;
    }
}