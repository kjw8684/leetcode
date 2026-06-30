class Solution {
    public int numberOfSubstrings(String s) {
        int len = s.length(), answer = 0, left = 1;
        int[] count = new int[3];

        for(int i = 0; i < len; i++) {
            count[s.charAt(i) - 'a']++;

            while(count[0] != 0 && count[1] != 0 && count[2] != 0) {
                int cur = s.charAt(left - 1) - 'a';
                if(count[cur] == 1) {
                    answer += left;
                    break;
                }
                else {
                    left++;
                    count[cur]--;
                }
            }
        }

        return answer;
    }
}