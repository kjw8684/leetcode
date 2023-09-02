class Solution {
    int min = 50;
    public int minExtraChar(String s, String[] dictionary) {
        int[] erase = new int[s.length() + 1];
        Arrays.fill(erase, s.length() + 1);
        erase[0] = 0;
        Set<String> dictionarySet = new HashSet<>(Arrays.asList(dictionary));
        for(int i = 1; i < s.length() + 1; i++){
            erase[i] = erase[i - 1] + 1;
            for(int j = 0; j < i + 1; j++){
                if(dictionarySet.contains(s.substring(i - j, i))){
                    erase[i] = Math.min(erase[i], erase[i - j]);
                }
            }
        }
        return erase[s.length()];
    }
}