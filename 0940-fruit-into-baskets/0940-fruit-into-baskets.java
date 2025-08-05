class Solution {
    public int totalFruit(int[] fruits) {
        int max = 0, left = 0, first = fruits[0], second = -1, len = fruits.length;
        int i = 1;

        for(; i < len; i++) {
            if(first != fruits[i]) {
                second = fruits[i];
                break;
            }
        }

        for(; i < len; i++) {
            if(fruits[i] != second) {
                max = Math.max(max, i - left);
                first = second;
                second = fruits[i];
                for(int j = i - 2; j >= 0; j--) {
                    if(second != fruits[j] && first != fruits[j]) {
                        left = j + 1;
                        break;
                    }
                }
            }
            else if(fruits[i] == first){
                first = second;
                second = fruits[i];
            }
        }

        return Math.max(max, len - left);
    }
}