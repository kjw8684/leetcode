class Solution {
    public int minOperations(int[] nums, int k) {
        int kcount = 0, ocount = 0;
        PriorityQueue<Long> queue = new PriorityQueue<>();
        for(int num : nums) {
            if(num < k) {
                kcount++;
            }
            queue.add(Long.valueOf(num));
        }
        
        for(; kcount != 0; ocount++) {
            Long first = queue.poll(), second = queue.poll();

            if(first < k) {
                kcount--;
            }
            if(second < k) {
                kcount--;
            }

            Long nnum = first * 2 + second;

            if(nnum < k) {
                kcount++;
            }
            queue.add(nnum);
        }

        return ocount;
    }
}