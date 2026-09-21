class Solution {
    public long[] resultArray(int[] nums, int k) {
        int len = nums.length;
        int[] count = new int[k];
        int[] temp = new int[k];
        long[] answer = new long[k];

        for(int i = 0; i < len; i++) {
            int cur = nums[i] % k;
            temp[cur]++;
            for(int j = 0; j < k; j++) {
                temp[(j * cur) % k] += count[j];
            }

            for(int j = 0; j < k; j++) {
                answer[j] += temp[j];
                count[j] = temp[j];
                temp[j] = 0;
            }
        }

        return answer;
    }
}