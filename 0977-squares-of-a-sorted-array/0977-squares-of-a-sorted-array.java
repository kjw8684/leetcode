class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length, current = 0, squares = 0, j = 0;
        int[] answer = new int[len];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < len; i++) {
            current = nums[i];
            squares = current * current;
            
            if (current < 0) {
                stack.push(squares);
                continue;
            }
            
            while (!stack.isEmpty() && squares > stack.peek()) {
                answer[j] = stack.pop();
                j++;
            }
            answer[j] = squares;
            j++;
        }
        
        while (!stack.isEmpty()) {
            answer[j] = stack.pop();
            j++;
        }
        
        return answer;
    }
}