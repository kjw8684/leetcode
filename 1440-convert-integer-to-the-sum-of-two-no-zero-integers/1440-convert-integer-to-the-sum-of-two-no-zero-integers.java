class Solution {
    public int[] getNoZeroIntegers(int n) {
        int answer = 0;

        for(int i = 1; i < n; i++) {
            int cur = i;
            boolean check = true;

            while(cur != 0) {
                if(cur % 10 == 0) {
                    check = false;
                    break;
                }
                cur /= 10;
            }

            cur = n - i;

            while(cur != 0) {
                if(cur % 10 == 0) {
                    check = false;
                    break;
                }
                cur /= 10;
            }

            if(check) {
                answer = i;
                break;
            }
        }
        return new int[] {answer, n - answer};
    }
}