class Solution {
    public static int maxSubarrayLength(int[] nums, int k) {
        int max = 0, len = nums.length, sum = 0, current = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < len; i++) {
            queue.add(nums[i]);
            sum++;

            if(!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
            else if(map.get(nums[i]) < k) {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else {
                while(!queue.isEmpty()){
                    current = queue.poll();
                    sum--;
                    if(current == nums[i]) {
                        break;
                    }

                    if(map.get(current) == 1) {
                        map.remove(current);
                    }
                    else{
                        map.put(current, map.get(current) - 1);
                    }
                }
            }

            if(max < sum){
                max = sum;
            }
        }

        return max;
    }
}