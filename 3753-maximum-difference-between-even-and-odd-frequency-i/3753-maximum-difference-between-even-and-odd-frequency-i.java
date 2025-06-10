class Solution {
    public int maxDifference(String s) {
        int maxOdd = 0, minEven = 101, len = s.length();
        int[] count = new int[26];

        for(int i = 0; i < len; i++) {
            count[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < 26; i++) {
            if(count[i] == 0) {
                continue;
            }
            else if(count[i] % 2 == 1){
                maxOdd = Math.max(maxOdd, count[i]);
            }
            else {
                minEven = Math.min(minEven, count[i]);
            }
        }

        return maxOdd - minEven;
    }
}