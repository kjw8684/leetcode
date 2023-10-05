class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int condition = nums.length / 3;
        HashMap<Integer, Integer> num = new HashMap<>();
        List<Integer> answer = new ArrayList<>();
        for (int i : nums) {
            if (num.get(i) == null) {
                num.put(i, 1);
            }else {
                num.put(i, num.get(i) + 1);
            }

            if (num.get(i) > condition && !answer.contains(i)) {
                answer.add(i);
            }
        }
        return answer;
    }
}