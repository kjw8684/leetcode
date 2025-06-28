class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int len = nums.length;
        if(len == k) {
            return nums;
        }

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < len; i++) {
            list.add(nums[i]);
        }

        int target = len - k, count = 0;

        while(count != target) {
            int min = 100001, minIndex = -1;
            for(int i = 0; i < len; i++) {
                if(min > list.get(i)) {
                    min = list.get(i);
                    minIndex = i;
                }
            }
            list.remove(minIndex);
            len--;
            count++;
        }

        int[] answer = new int[k];

        for(int i = 0; i < k; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}