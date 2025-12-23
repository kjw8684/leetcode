class Solution {
    public int maxTwoEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        int len = events.length, max = 0;
        int[] dp = new int[len];
        dp[len - 1] = events[len - 1][2];

        for(int i = len - 2; i >= 0; i--) {
            dp[i] = Math.max(events[i][2], dp[i + 1]);
        }

        for(int i = 0; i < len; i++) {
            int nextEventIndex = -1, left = i + 1, right = len - 1;
            while(left <= right) {
                int mid = left + (right - left) / 2;
                if(events[mid][0] > events[i][1]) {
                    nextEventIndex = mid;
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }
            if (nextEventIndex != -1) {
                max = Math.max(max, events[i][2] + dp[nextEventIndex]);
            }
            max = Math.max(max, events[i][2]);
        }
        
        return max;
    }
}