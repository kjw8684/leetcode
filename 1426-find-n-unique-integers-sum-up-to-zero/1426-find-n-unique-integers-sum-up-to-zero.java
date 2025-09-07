class Solution {
    public int[] sumZero(int n) {
        int[] answer = new int[n];
        int half = n / 2, cur = 1;

        if(n % 2 == 0) {
            for(int i = 0; i < n; i += 2) {
                answer[i] = cur;
                answer[i + 1] = cur * -1;
                cur++;
            }
        }
        else {
            answer[0] = 0;

            for(int i = 1; i < n; i += 2) {
                answer[i] = cur;
                answer[i + 1] = cur * -1;
                cur++;
            }
        }

        return answer;
    }
}