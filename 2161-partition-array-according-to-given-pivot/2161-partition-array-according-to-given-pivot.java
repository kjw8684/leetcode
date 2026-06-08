class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int count = 0, len = nums.length, index = 0;
        int[] answer = new int[len];
        Queue<Integer> less = new LinkedList<>();
        Queue<Integer> more = new LinkedList<>();

        for(int num : nums) {
            if(num > pivot) {
                more.offer(num);
            }
            else if(num < pivot) {
                less.offer(num);
            }
            else {
                count++;
            }
        }

        while(!less.isEmpty()) {
            answer[index] = less.poll();
            index++;
        }

        for(int i = 0; i < count; i++) {
            answer[index] = pivot;
            index++;
        }

        while(!more.isEmpty()) {
            answer[index] = more.poll();
            index++;
        }

        return answer;
    }
}