class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int len = times.length, target = times[targetFriend][0], answer = 0;
        int[] sits = new int[len];

        Arrays.sort(times, (a, b) -> Integer.compare(a[0], b[0]));

        for(int i = 0; i < len; i++) {
            if(times[i][0] == target) {
                answer = min_sits(sits, times[i][0], len);
                break;
            }
            else {
                sit(sits, times[i][0], times[i][1], len);
            }
        }

        return answer;
    }

    public void sit(int[] sits, int time, int target, int len) {
        boolean have = false;

        for(int i = 0; i < len; i++) {
            if(sits[i] <= time) {
                sits[i] = 0;
            }

            if(!have && sits[i] == 0) {
                sits[i] = target;
                have = true;
            }
        }
    }

    public int min_sits(int[] sits, int target, int len) {
        for(int i = 0; i < len; i++) {
            if(sits[i] <= target) {
                return i;
            }
        }

        return -1;
    }
}