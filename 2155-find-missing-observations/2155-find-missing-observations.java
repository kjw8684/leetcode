class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int len = rolls.length, left = mean * (n + len) - Arrays.stream(rolls).sum(), cur = 0;
        int[] answer = new int[n];

        for(int i = 0; i < n; i++) {
            cur = left / (n - i);
            if(cur > 6 || cur < 1) {
                return new int[]{};
            }
            answer[i] = cur;
            left -= cur;
        }

        return answer;
    }
}