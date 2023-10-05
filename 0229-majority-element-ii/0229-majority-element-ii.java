class Solution {
    int condition, cur_num_count = 0;
    List<Integer> answer = new ArrayList<>();
    
    public List<Integer> majorityElement(int[] nums) {
        condition = nums.length / 3;
        Arrays.sort(nums);

        if (condition < 1) {
            appear0(nums);
        }else {
            more_appear(nums);
        }

        return answer;
    }

    public void appear0(int[] nums) {
        for (int i : nums) {
            if (!answer.contains(i)) {
                answer.add(i);
            }
        }
    }

    public void more_appear(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                cur_num_count++;
            }else {
                cur_num_count = 0;
            }

            boolean is_addable = cur_num_count == condition && !answer.contains(i);
            if (is_addable) {
                answer.add(nums[i]);
            }
        }
    }
}