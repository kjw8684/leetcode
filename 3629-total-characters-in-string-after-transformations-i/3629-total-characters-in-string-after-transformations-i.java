class Solution {
    public int lengthAfterTransformations(String s, int t) {
        int len = s.length(), count = t / 26, left = t % 26;
        int[] alpha = new int[26];
        long answer = 0;

        for(int i = 0; i < len; i++) {
            alpha[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < count; i++) {
            int a = alpha[25];
            for(int j = 25; j > 0; j--) {
                alpha[j] += alpha[j - 1];
                alpha[j] %= 1000000007;
            }
            alpha[0] += a;
            alpha[1] += a;
            alpha[0] %= 1000000007;
            alpha[1] %= 1000000007;
        }

        for(int i = 0; i < left; i++) {
            int z = alpha[25];
            for(int j = 25; j > 0; j--) {
                alpha[j] = alpha[j - 1];
            }
            alpha[0] = z;
            alpha[1] += z;
            alpha[1] %= 1000000007;
        }

        for(int cur : alpha) {
            answer += cur;
        }
        System.out.println("");

        return (int)(answer % 1000000007);
    }
}