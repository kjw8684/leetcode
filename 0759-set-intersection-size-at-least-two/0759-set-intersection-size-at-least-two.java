class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> {
            if(o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }
            return o1[1]-o2[1];
        });

        int first = intervals[0][1] - 1, second = intervals[0][1], count = 2;

        for(int[] interval : intervals) {
            while(first < interval[0]) {
                first = second;
                if(second == interval[1]) {
                    first = second - 1;
                }
                else {
                    second = interval[1];
                }
                count++;
            }
        }

        return count;
    }
}