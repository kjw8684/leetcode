class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int len = colors.length, same = -1, count = 0;
        int[] newColors = new int[len + k - 1];

        for(int i = 1; i < k; i++) {
            if(colors[i] == colors[i - 1]) {
                same = i;
            }
        }

        for(int i = 0; i < len; i++) {
            newColors[i] = colors[i];
        }
        for(int i = 0; i < k - 1; i++) {
            newColors[len + i] = colors[i];
        }
        len += k - 1;

        if(same == -1) {
            count++;
        }

        for(int i = k; i < len; i++) {
            if(newColors[i] == newColors[i - 1]) {
                same = i;
            }
            if(same <= i - k + 1) {
                count++;
            }
        }

        return count;
    }
}