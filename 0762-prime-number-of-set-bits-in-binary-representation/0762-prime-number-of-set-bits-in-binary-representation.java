class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        Set<Integer> Prime = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19));
        for(int i = left; i <= right; i++) {
            int cur = i, cur_count = 0;

            while(cur != 0) {
                if(cur % 2 == 1) {
                    cur_count++;
                }
                cur /= 2;
            }

            if(Prime.contains(cur_count)) {
                count++;
            }
        }

        return count;
    }
}