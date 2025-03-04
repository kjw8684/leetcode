class Solution {
    public boolean checkPowersOfThree(int n) {
        for(int i = 0; i < 15; i++) {
            if(n < (int)Math.pow(3, i)) {
                break;
            }
            if(cheak(n - (int)Math.pow(3, i), i + 1)) {
                return true;
            }
        }

        return false;
    }

    public boolean cheak(int sum, int index) {
        if(sum == 0) {
            return true;
        }

        for(int i = index; i < 15; i++) {
            if(sum < (int)Math.pow(3, i)) {
                break;
            }
            if(cheak(sum - (int)Math.pow(3, i), i + 1)) {
                return true;
            }
        }

        return false;
    }
}