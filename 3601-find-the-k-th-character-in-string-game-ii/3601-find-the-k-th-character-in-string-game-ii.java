class Solution {
    public char kthCharacter(long k, int[] operations) {
        long poll = 1;
        int count = 0;

        while(poll < k) {
            poll *= 2;
            count++;
        }
        poll /= 2;

        boolean[] cheak = new boolean[count];

        long start = k;
        for(int i = count - 1; i >= 0; i--) {
            if(start > poll) {
                cheak[i] = true;
                start -= poll;
            }
            poll /= 2;
        }

        int plus = 0;
        for(int i = 0; i < count; i++) {
            if(operations[i] == 1 && cheak[i]) {
                plus++;
            }
        }

        return (char)('a' + (plus % 26));
    }
}