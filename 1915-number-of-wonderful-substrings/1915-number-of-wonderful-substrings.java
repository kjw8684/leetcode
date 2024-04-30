class Solution {
    public long wonderfulSubstrings(String word) {
        long[] cnt = new long[1024];
        cnt[0] = 1;
        int mask = 0, len = word.length(), idx;
        long answer = 0;
        
        for(int i = 0; i < len; i++) {
            idx = word.charAt(i) - 'a';
            mask ^= 1 << idx;
            answer += cnt[mask];
            for(int j = 1; j < 513; j *= 2) {
                answer += cnt[mask ^ j];
            }
            cnt[mask]++;
        }

        return answer;
    }
}