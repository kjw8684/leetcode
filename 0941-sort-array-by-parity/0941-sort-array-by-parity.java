class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                list.add(nums[i]);
            }else {
                list.add(0, nums[i]);
            }
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}