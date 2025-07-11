class Solution {
    public int mostBooked(int n, int[][] meetings) {
        int[] count = new int[n];
        long[] room = new long[n];
        Arrays.sort(meetings, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });

        for(int[] meeting : meetings) {
            boolean cheak = false;
            long min = Long.MAX_VALUE;
            int index = -1;
            for(int i = 0; i < n; i++) {
                if(room[i] <= meeting[0]) {
                    room[i] = meeting[1];
                    count[i]++;
                    cheak = true;
                    break;
                }
                if(min > room[i]) {
                    min = room[i];
                    index = i;
                }
            }

            if(!cheak) {
                room[index] += meeting[1] - meeting[0];
                count[index]++;
            }

        }

        int max = 0, index = -1;
        for(int i = 0; i < n; i++) {
            if(max < count[i]) {
                index = i;
                max = count[i];
            }
        }

        return index;
    }
}