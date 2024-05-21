class Solution {
    List<List<Integer>> answer = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        answer.add(Arrays.asList());
        for(int i = 0; i < nums.length; i++) {
            search(nums, i, Arrays.asList(nums[i]));
        }
        return answer;
    }
    
    public void search(int[] nums, int current, List<Integer> val) {
        if(!answer.contains(val)) {
            answer.add(val);
        }
        for(int i = current + 1; i < nums.length; i++) {
            List<Integer> temp = new ArrayList<>(val);
            temp.add(nums[i]);
            search(nums, i, temp);
        }
    } 
}