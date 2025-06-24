class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> answer = new ArrayList<>();
        int len = nums.length;
        boolean[] cheak = new boolean[len];
        
        for(int i = 0; i < len; i++) {
            if(nums[i] == key) {
                int start = i < k ? 0 : i - k, end = i + k >= len ? len - 1 : i + k;
                
                for(int j = start; j <= end; j++) {
                    cheak[j] = true;
                }
            }
        }

        for(int i = 0; i < len; i++) {
            if(cheak[i]) {
                answer.add(i);
            }
        }

        return answer;
    }
}