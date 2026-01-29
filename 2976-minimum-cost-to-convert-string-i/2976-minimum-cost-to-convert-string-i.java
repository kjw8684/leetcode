class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        long[][] map = new long[26][26];
        int len = original.length, tlen = target.length();
        long answer = 0;

        for(int i = 0; i < 26; i++) {
            for(int j = 0; j < 26; j++) {
                if(i != j) {
                    map[i][j] = 10000000;
                }
            }
        }

        for(int i = 0; i < len; i++) {
            map[original[i] - 'a'][changed[i] - 'a'] = Math.min(map[original[i] - 'a'][changed[i] - 'a'], cost[i]);
        }

        for(int i = 0; i < 26; i++) {
            for(int j = 0; j < 26; j++) {
                for(int k = 0; k < 26; k++) {
                    if (map[j][i] + map[i][k] < map[j][k]) {
                        map[j][k] = map[j][i] + map[i][k];
                    }
                }
            }
        }

        for(int i = 0; i < tlen; i++) {
            if(map[source.charAt(i) - 'a'][target.charAt(i) - 'a'] == 10000000) {
                return -1;
            }
            else {
                answer += map[source.charAt(i) - 'a'][target.charAt(i) - 'a'];
            }
        }

        return answer;
    }
}