class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int len = nums.length, equal = 0;
        Queue<Integer> less = new LinkedList<>(), greater = new LinkedList<>();

        for(int cur : nums) {
            if(cur < pivot) {
                less.add(cur);
            }
            else if(cur > pivot) {
                greater.add(cur);
            }
            else {
                equal++;
            }
        }
        
        int index = 0;

        while(!less.isEmpty()) {
            nums[index] = less.poll();
            index++;
        }

        while(equal != 0) {
            nums[index] = pivot;
            index++;
            equal--;
        }

        while(!greater.isEmpty()) {
            nums[index] = greater.poll();
            index++;
        }

        return nums;
    }
}