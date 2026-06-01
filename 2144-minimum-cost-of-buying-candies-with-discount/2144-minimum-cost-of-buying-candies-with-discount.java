class Solution {
    public int minimumCost(int[] cost) {
        int sum = 0, len = cost.length, index = 0;
        Arrays.sort(cost);

        for(int i = len - 1; i >= 0; i--) {
            if(index % 3 != 2) {
                sum += cost[i];
            }
            index++;
        }

        return sum;
    }
}