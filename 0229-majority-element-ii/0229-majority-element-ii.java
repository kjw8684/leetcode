class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        int condition = nums.length / 3, cur_num_count = 0;
        List<Integer> answer = new ArrayList<>();

        if (condition < 1) {
            for (int i : nums) {
                if (!answer.contains(i)) {
                    answer.add(i);
                }
            }
        }else {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i - 1] == nums[i]) {
                    cur_num_count++;
                }else {
                    cur_num_count = 0;
                }

                if (cur_num_count == condition && !answer.contains(i)) {
                    answer.add(nums[i]);
                }
            }
        }

        return answer;
    }
}