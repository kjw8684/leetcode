class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int index = 0;
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(nums);

        for(int num : nums) {
            if(num == target) {
                answer.add(index);
            }
            else if(num > target) {
                break;
            }
            index++;
        }

        return answer;
    }
}