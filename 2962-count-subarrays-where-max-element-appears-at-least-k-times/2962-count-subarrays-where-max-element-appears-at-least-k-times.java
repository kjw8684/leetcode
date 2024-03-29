class Solution {
    public long countSubarrays(int[] nums, int k) {
        long answer = 0, left = 0;
        int len = nums.length, max = 0, count = 0, start = 0;

        for(int i = 0; i < len; i++) {
            if(max < nums[i]) {
                max = nums[i];
            }
        }

        for(int i = 0; i < len; i++) {
            count = 0;
            for(int j = i; j < len; j++) {
                if(nums[j] == max) {
                    count++;
                    if(count == 1) {
                        start = j;
                        left = j - i + 1;
                    }

                }
                if(count == k) {
                    answer += left * (len - j);
                    break;
                }
            }
            
            if(count < k) {
                break;
            }
            i = start;
        }

        return answer;
    }
}