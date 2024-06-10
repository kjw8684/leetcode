class Solution {
    public int heightChecker(int[] heights) {
        int len = heights.length, answer = 0;
        int[] sorted = new int[len];
        for(int i = 0; i < len; i++) {
            sorted[i] = heights[i];
        }
        Arrays.sort(sorted);
        
        for(int i = 0; i < len; i++) {
            if(sorted[i] != heights[i]) {
                answer++;
            }
        }
        
        return answer;
    }
}