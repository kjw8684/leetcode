class Solution {
    public int maximumLength(String s) {
        int[][] count = new int[26][3];
        int cur_count = 0, len = s.length(), max = 0;
        char cur = 'a';

        for(int i = 0; i < len; i++) {
            if(s.charAt(i) != cur) {
                add(count, cur - 97, cur_count);
                cur = s.charAt(i);
                cur_count = 1;
            }
            else {
                add(count, cur - 97, cur_count);
                cur_count++;
            }
        }

        add(count, cur - 97, cur_count);

        for(int i = 0; i < 26; i++) {
            max = Math.max(max, count[i][2]);
        }

        return max == 0 ? -1 : max;
    }

    public void add(int[][] count, int cur, int cur_count) {
        int temp = 0;
        for(int i = 0; i < 3; i++) {
            if(count[cur][i] < cur_count) {
                temp = count[cur][i];
                count[cur][i] = cur_count;
                cur_count = temp;
            }
        }
    }
}