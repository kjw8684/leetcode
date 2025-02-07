class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int len = queries.length, color = 0;
        int[] answer = new int[len];
        Map<Integer, Integer> curcolor = new HashMap<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < len; i++) {
            if(!curcolor.containsKey(queries[i][0])) {
                if(!map.containsKey(queries[i][1])) {
                    color++;
                    map.put(queries[i][1], 1);
                }
                else {
                    map.compute(queries[i][1], (key, value) -> value + 1);
                }
                curcolor.put(queries[i][0], queries[i][1]);
            }
            else {
                int cur = curcolor.get(queries[i][0]);
                if(map.get(cur) == 1) {
                    color--;
                    map.remove(cur);
                }
                else {
                    map.compute(cur, (key, value) -> value - 1);
                }

                if(!map.containsKey(queries[i][1])) {
                    color++;
                    map.put(queries[i][1], 1);
                }
                else {
                    map.compute(queries[i][1], (key, value) -> value + 1);
                }
                curcolor.put(queries[i][0], queries[i][1]);
            }

            answer[i] = color;
        }

        return answer;
    }
}