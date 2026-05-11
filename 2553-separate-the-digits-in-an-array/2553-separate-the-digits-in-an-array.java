class Solution {
    public int[] separateDigits(int[] nums) {
        int count = 0;

        for(int num : nums) {
            while(num != 0) {
                num /= 10;
                count++;
            }
        }

        int[] answer = new int[count];
        int index = 0;
        Stack<Integer> stack = new Stack<>();
        for(int num : nums) {
            while(num != 0) {
                stack.add(num % 10);
                num /= 10;
            }

            while(!stack.isEmpty()) {
                answer[index] = stack.pop();
                index++;
            }
        }

        return answer;
    }
}