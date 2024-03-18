class Solution {
    public int findMinArrowShots(int[][] points) {
        int len = points.length, answer = len, current = 0;
        Arrays.sort(points, (e1, e2) -> {
            if(Long.valueOf(e1[0]) - Long.valueOf(e2[0]) < 0) {
                return -1;
            }
            if(Long.valueOf(e1[0]) - Long.valueOf(e2[0]) > 0) {
                return 1;
            }
            return 0;
        });

        for(int i = 0; i < len; i++) {
            current = points[i][1];
            for(int j = i + 1; j < len; j++) {
                if(points[j][0] <= current) {
                    if(points[j][1] < current){
                        current = points[j][1];
                    }
                    answer--;
                    i++;
                    continue;
                }
                break;
            }
        }

        return answer;
    }
}