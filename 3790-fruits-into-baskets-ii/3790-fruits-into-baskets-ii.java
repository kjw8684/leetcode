class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int len = fruits.length, left = 0, index = -1;
        boolean[] check = new boolean[len];

        for(int i = 0; i < len; i++) {
            index = -1;
            for(int j = 0; j < len; j++) {
                if(!check[j] && fruits[i] - baskets[j] <= 0) {
                    index = j;
                    break;
                }
            }
            
            if(index != -1) {
                check[index] = true;
            }
            else {
                left++;
            }
        }

        return left;
    }
}