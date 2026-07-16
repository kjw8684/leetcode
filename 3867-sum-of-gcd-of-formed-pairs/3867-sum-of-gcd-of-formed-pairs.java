class Solution {
    public long gcdSum(int[] nums) {
        long sum = 0L;
        int len = nums.length, max = 0;
        int[] prefixGcd = new int[len];

        for(int i = 0; i < len; i++) {
            max = Math.max(max, nums[i]);
            prefixGcd[i] = gcd(max, nums[i]);
        }
        Arrays.sort(prefixGcd);

        for(int i = 0; i < len / 2; i++) {
            sum += gcd(prefixGcd[i], prefixGcd[len - i - 1]);
        }

        return sum;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
}