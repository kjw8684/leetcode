class Solution {
    public char kthCharacter(int k) {
        int[] answer = new int[512];
        int start = 1;

        while(k > start) {
            int index = 0;
            for(int i = start; i < start * 2; i++) {
                answer[i] = answer[index] + 1;
                index++;
            }
            start *= 2;
        }

        return (char)('a' + (answer[k - 1] % 26));
    }
}