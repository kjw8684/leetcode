class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new TreeMap<>();

        for(int[] cur : nums1) {
            map.put(cur[0], cur[1]);
        }

        for(int[] cur : nums2) {
            if(map.containsKey(cur[0])) {
                map.put(cur[0], map.get(cur[0]) + cur[1]);
            }
            else {
                map.put(cur[0], cur[1]);
            }
        }

        int size = map.size(), index = 0;
        int[][] answer = new int[size][2];

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            answer[index][0] = entry.getKey();
            answer[index][1] = entry.getValue();
            index++;
        }

        return answer;
    }
}