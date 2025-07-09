class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int len = startTime.length;
        int[] rest = new int[len + 1];
        rest[0] = startTime[0];

        for(int i = 1; i < len; i++) {
            rest[i] = startTime[i] - endTime[i - 1];
        }

        rest[len] = eventTime - endTime[len - 1];

        int max = 0;
        for(int i = k; i <= len; i++) {
            int cur = 0;
            for(int j = 0; j <= k; j++) {
                cur += rest[i - j];
            }

            max = Math.max(max, cur);
        }

        return max;
    }
}