class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Map<Integer, Integer> max = new TreeMap<>();
        int len = queries.length, beauty = 0;
        int[] answer = new int[len];

        for(int i = 0; i < len; i++) {
            max.put(queries[i], 0);
        }

        for(int[] value : items) {
            if(!max.containsKey(value[0]) || (max.containsKey(value[0]) && max.get(value[0]) < value[1])) {
                max.put(value[0], value[1]);
            }
        }

        for (Map.Entry<Integer, Integer> entry : max.entrySet()) {
            beauty = Math.max(beauty, entry.getValue());
            max.put(entry.getKey(), beauty);
        }

        for(int i = 0; i < len; i++) {
            answer[i] = max.get(queries[i]);
        }

        return answer;
    }
}