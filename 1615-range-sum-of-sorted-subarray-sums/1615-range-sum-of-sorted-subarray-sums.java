class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int index = 0, answer = 0, count = 0;
        int[] array = new int[n * (n + 1) / 2];

        for(int i = 0; i < n; i++) {
            count = 0;
            for(int j = i; j < n; j++) {
                count += nums[j];
                array[index] = count;
                index++;
            }
        }

        Arrays.sort(array);

        for(int i = left - 1; i < right; i++) {
            answer += array[i];
            answer %= 1000000007;
        }

        return answer;
    }
}