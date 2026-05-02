class Solution {
    public int rotatedDigits(int n) {
        int count = 0;
        Set<Integer>rotatedset = new HashSet<>(Arrays.asList(0, 1, 2, 5, 6, 8, 9));
        Set<Integer>changeset = new HashSet<>(Arrays.asList(2, 5, 6, 9));

        for(int i = 1; i <= n; i++) {
            int cur = i;
            boolean rotated = true, change = false;

            while(cur != 0) {
                if(!rotatedset.contains(cur % 10)) {
                    rotated = false;
                    break;
                }
                if(changeset.contains(cur % 10)) {
                    change = true;
                }
                cur /= 10;
            }

            if(rotated && change) {
                count++;
            }
        }

        return count;
    }
}