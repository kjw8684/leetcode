class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int left = mean * (n + rolls.length) - Arrays.stream(rolls).sum();
        int[] answer = new int[n];
        if(left > n * 6 || left < n) {
            return new int[]{};
        }

        for(int i = 0; i < n; i++) {
            answer[i] = left / (n - i);
            left -= answer[i];
        }

        return answer;
    }
}