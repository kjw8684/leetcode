class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int len = startTime.length, sum = startTime[0], max = 0;

        if(k == len) {
            for(int i = 1; i < k; i++) {
                sum += startTime[i] - endTime[i - 1];
            }
            sum += eventTime - endTime[len - 1];
            
            return sum;
        }

        for(int i = 1; i <= k; i++) {
            sum += startTime[i] - endTime[i - 1];
        }
        max = Math.max(max, sum);
        sum -= startTime[0];


        for(int i = k + 1; i < len; i++) {
            sum += startTime[i] - endTime[i - 1];
            max = Math.max(max, sum);
            sum -= startTime[i - k] - endTime[i - k - 1];
        }

        sum += eventTime - endTime[len - 1];

        return Math.max(max, sum);
    }
}