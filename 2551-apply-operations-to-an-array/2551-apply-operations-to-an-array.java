class Solution {
    public int[] applyOperations(int[] nums) {
        int len = nums.length;
        Stack<Integer> stack = new Stack<>();
        if(nums[0] != 0) {
            stack.add(nums[0]);
        }

        for(int i = 1; i < len; i++) {
            if(nums[i] == 0) {
                continue;
            }
            else if(nums[i - 1] == nums[i]) {
                stack.pop();
                stack.add(nums[i] * 2);
                nums[i - 1] = nums[i - 1] * 2;
                nums[i] = 0;
            }
            else {
                stack.add(nums[i]);
            }
        }

        int[] answer = new int[len];
        int index = 0;
        Collections.reverse(stack);

        while(!stack.isEmpty()) {
            answer[index] = stack.pop();
            index++;
        }

        return answer;
    }
}