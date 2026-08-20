class Solution {
    public int[] resultArray(int[] nums) {
        int len = nums.length, cur = 0, before = nums[1];
        int[] answer = new int[nums.length];
        Queue<Integer> queue = new LinkedList<>();
        answer[0] = nums[0];
        queue.offer(nums[1]);

        for(int i = 2; i < len; i++) {
            if(answer[cur] > before) {
                cur++;
                answer[cur] = nums[i];
            }
            else {
                queue.offer(nums[i]);
                before = nums[i];
            }
        }
        cur++;

        while(!queue.isEmpty()) {
            answer[cur] = queue.poll();
            cur++;
        }

        return answer;
    }
}