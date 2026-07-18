class Solution {
    public int findGCD(int[] nums) {
        int min = 1000, max = 1, gcd = 1;

        for(int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        for(int i = 2; i <= min; i++) {
            if(min % i == 0 && max % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }
}