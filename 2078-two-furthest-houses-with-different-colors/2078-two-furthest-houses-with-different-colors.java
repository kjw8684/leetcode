class Solution {
    public int maxDistance(int[] colors) {
        int len = colors.length, first = colors[0], second = -1, secondIndex = -1, max = 0;
        boolean check = false;

        for(int i = 1; i < len; i++) {
            if(colors[i] != first) {
                if(!check) {
                    second = colors[i];
                    secondIndex = i;
                    check = true;
                }
                max = Math.max(max, i);
            }
            else if(check) {
                max = Math.max(max, i - secondIndex);
            }
        }

        return max;
    }
}