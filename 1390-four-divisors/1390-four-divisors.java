class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for(int num : nums) {
            sum += divisors(num);
        }

        return sum;
    }

    public int divisors(int target) {
        int count = 0, sum = 0;
        for(int i = 1; i <= target; i++) {
            if(target % i == 0) {
                count++;
                sum += i;
            }

            if(count > 4) {
                return 0;
            }
        }

        if(count == 4) {
            return sum;
        }
        else {
            return 0;
        }
    }
}