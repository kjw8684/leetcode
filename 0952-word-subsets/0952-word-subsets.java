class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int len = words2.length, cheakLen = 0;
        int[][] cheak = new int[len][26];
        int[] cheakMax = new int[26];
        List<String> list = new ArrayList<>();

        for(int i = 0; i < len; i++) {
            cheakLen = words2[i].length();
            for(int j = 0; j < cheakLen; j++) {
                cheak[i][words2[i].charAt(j) - 'a']++;
            }

            for(int j = 0; j < 26; j++) {
                cheakMax[j] = Math.max(cheakMax[j], cheak[i][j]);
            }
        }

        int[] cur = new int[26];
        int stringLen = 0;
        boolean subset = true;
        for(String current : words1) {
            stringLen = current.length();
            Arrays.fill(cur, 0);
            subset = true;
            for(int i = 0; i < stringLen; i++) {
                cur[current.charAt(i) - 'a']++;
            }

            for(int i = 0; i < 26 && subset; i++) {
                if(cur[i] < cheakMax[i]) {
                    subset = false;
                }
            }

            if(subset) {
                list.add(current);
            }
        }

        return list;
    }
}