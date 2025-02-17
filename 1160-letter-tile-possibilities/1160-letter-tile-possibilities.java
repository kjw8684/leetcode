class Solution {
    public int numTilePossibilities(String tiles) {
        int len = tiles.length();
        int[] count = new int[26];
        for(int i = 0; i < len; i++) {
            count[tiles.charAt(i) - 'A']++;
        }

        len++;
        int[] fac = new int[len];
        fac[0] = 1;

        for (int i = 1; i < len; i++) {
            fac[i] = i * fac[i - 1];
        }

        int[] lengthCounts = new int[len];
        lengthCounts[0] = 1;
        for(int i = 0; i < 26; i++){
            if(count[i] != 0){
                int[] temp = new int[len];
                for(int j = 0; j < len && lengthCounts[j] > 0; j++){
                    for(int k = 1; k <= count[i]; k++){
                        int totalLength = j + k;
                        temp[totalLength] += lengthCounts[j] * fac[totalLength] / (fac[k] * fac[j]);
                    }
                }
                for(int j = 0; j < len; j++){
                    lengthCounts[j] += temp[j];
                }
            }
        }
        int ans = 0;
        for(int i = 1; i < len; i++){
            ans += lengthCounts[i];
        }
        return ans;
    }
}