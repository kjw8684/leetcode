class Solution {
    public boolean primeSubOperation(int[] nums) {
        List<Integer> prime = new ArrayList<>();
        boolean cheak = true;
        int len = nums.length, p = 0;

        for(int i = 2; i < 1000; i++) {
            cheak = true;
            for(Integer j : prime) {
                if(i % j == 0) {
                    cheak = false;
                    break;
                }
            }
            if(cheak) {
                prime.add(i);
            }
        }

        for(Integer i : prime) {
            if(i < nums[0]) {
                p = i;
            }
            else {
                break;
            }
        }
        nums[0] -= p;

        for(int i = 1; i < len; i++) {
            p = 0;
            for(Integer j : prime) {
                if(j < nums[i] && nums[i] - j > nums[i - 1]) {
                    p = j;
                }
                else {
                    break;
                }
            }
            nums[i] -= p;

            if(nums[i] <= nums[i - 1]) {
                return false;
            }
        }

        return true;
    }
}