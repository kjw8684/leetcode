class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        if(value == 1) {
            return nums.length;
        }

        int[] count = new int[value];
        int answer = 0;

        for(int num : nums) {
            if(num < 0) {
                num = (num % value) + value;
            }
            count[num % value]++;
        }

        while(true) {
            for(int i = 0; i < value; i++) {
                if(count[i] > 0) {
                    count[i]--;
                    answer++;
                }
                else {
                    return answer;
                }
            }
        }

    }
}