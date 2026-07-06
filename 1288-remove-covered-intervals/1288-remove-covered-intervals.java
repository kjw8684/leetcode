class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int count = 0;
        int[] before = new int[2];
        before[0] = -1;
        before[1] = -1;
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        for(int[] interval : intervals) {
            if(interval[0] == before[0] && interval[1] > before[1]) {
                before[1] = interval[1];
            }
            if(interval[0] != before[0] && interval[1] > before[1]) {
                before[0] = interval[0];
                before[1] = interval[1];
                count++;
            }
        }

        return count;
    }
}