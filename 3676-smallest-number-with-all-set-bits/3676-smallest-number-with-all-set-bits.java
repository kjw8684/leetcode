class Solution {
    public int smallestNumber(int n) {
        int answer = 1;

        while(answer < n) {
            answer = answer << 1;
            answer++;
        }

        return answer;
    }
}