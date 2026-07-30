class Solution {
    public int minimumPushes(String word) {
        int sum = 0, count = 1;
        int[] alpha = new int[26];

        for(char cur : word.toCharArray()) {
            alpha[cur - 'a']++;
        }

        Arrays.sort(alpha);

        for(int i = 25; i >= 0; i--) {
            sum += alpha[i] * count;
            if(i % 8 == 2) {
                count++;
            }
        }

        return sum;
    }
}