class Solution {
    public int numIdenticalPairs(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int i : nums) {
            if (count.get(i) == null) {
                count.put(i, 1);
            }else {
                answer += count.get(i);
                count.put(i, count.get(i) + 1);
            }
        }

        return answer;
    }
}