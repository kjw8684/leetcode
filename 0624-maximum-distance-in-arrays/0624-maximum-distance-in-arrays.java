class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min = arrays.get(0).get(0), max = arrays.get(0).get(arrays.get(0).size() - 1), answer = 0;

        for(int i = 1; i < arrays.size(); i++) {
            answer = Math.max(answer, Math.max(max - arrays.get(i).get(0), arrays.get(i).get(arrays.get(i).size() - 1) - min));
            min = Math.min(min, arrays.get(i).get(0));
            max = Math.max(max, arrays.get(i).get(arrays.get(i).size() - 1));
        }

        return answer;
    }
}