class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(String word : words) {
            int sum = 0;
            for(char cur : word.toCharArray()) {
                sum += weights[cur - 'a'];
            }
            sb.append((char)('z' - (sum % 26)));
        }

        return sb.toString();
    }
}