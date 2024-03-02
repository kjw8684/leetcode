class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length, current = 0;
        int[] answer = new int[len];
        
        for (int i = 0; i < len; i++) {
            current = nums[i];
            answer[i] = current * current;
        }
        Arrays.sort(answer);
        
        return answer;
    }
}