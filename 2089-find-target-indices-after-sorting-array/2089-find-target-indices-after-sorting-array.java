class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int before = 0, same = 0;
        List<Integer> answer = new ArrayList<>();

        for(int num : nums) {
            if(num == target) {
                same++;
            }
            else if(num < target) {
                before++;
            }
        }

        for(int i = 0; i < same; i++) {
            answer.add(before + i);
        }

        return answer;
    }
}