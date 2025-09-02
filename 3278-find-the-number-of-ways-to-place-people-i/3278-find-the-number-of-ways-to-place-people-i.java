class Solution {
    public int numberOfPairs(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int cmp = o2[0] - o1[0];
                if(cmp == 0) {
                    return o1[1] - o2[1];
                }

                return cmp;
            }
        });
        int len = points.length, count = 0;

        for(int i = 0; i < len - 1; i++) {
            int max = 51;
            for(int j = i + 1; j < len; j++) {
                if(points[i][1] <= points[j][1] && max > points[j][1]) {
                    max = points[j][1];
                    count++;
                }
            }
        }

        return count;
    }
}