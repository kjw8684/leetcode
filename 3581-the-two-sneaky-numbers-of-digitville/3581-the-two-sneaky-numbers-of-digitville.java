class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int len = nums.length;
        int[] answer = new int[2];
        Arrays.sort(nums);
        boolean check = false;

        for(int i = 1; i < len; i++) {
            if(nums[i] == nums[i - 1]) {
                if(check) {
                    answer[1] = nums[i];
                    break;
                }
                else {
                    answer[0] = nums[i];
                    check = true;
                }
            }
        }

        return answer;
    }
}