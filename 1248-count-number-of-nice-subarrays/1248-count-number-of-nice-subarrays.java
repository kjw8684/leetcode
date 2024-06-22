class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int len = nums.length, answer = 0, current = 0, queuestart = 0,start = 0, end = 0;
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0; current < k; i++) {
            if(i == len) {
                return 0;
            }
            
            queue.offer(nums[i]);
            if(nums[i] % 2 == 1) {
                current++;
                queuestart = i + 1;
            }
        }
        
        for(int i = queuestart; i < len; i++) {
            start = 0;
            end = 1;
            while(!queue.isEmpty()) {
                start++;
                if(queue.poll() % 2 == 1) {
                    break;
                }
            }
            while(i < len) {
                queue.offer(nums[i]);
                if(nums[i] % 2 == 1) {
                    break;
                }
                end++;
                i++;
            }
            
            answer += start * end;
        }
        
        if(nums[len - 1] % 2 == 1) {
            start = 0;
            while(!queue.isEmpty()) {
                start++;
                if(queue.poll() % 2 == 1) {
                    break;
                }
            }
            answer += start;
        }
        
        return answer;
    }
}