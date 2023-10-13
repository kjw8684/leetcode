class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int cl = cost.length;
        int[] pay1 = new int[cl], pay2 = new int[cl];
        pay1[0] = cost[0];
        pay1[1] = cost[1] + cost[0];

        pay2[0] = cost[1];
        pay2[1] = cost[1];


        for (int i = 2; i < cl; i++) {
            if (pay1[i - 1] < pay1[i - 2]) {
                pay1[i] = pay1[i - 1] + cost[i];
            }else {
                pay1[i] = pay1[i - 2] + cost[i];
            }
        }
        int pay1_min = pay1[cl - 1] < pay1[cl - 2] ? pay1[cl - 1] : pay1[cl - 2];

        for (int i = 2; i < cl; i++) {
            if (pay2[i - 1] < pay2[i - 2]) {
                pay2[i] = pay2[i - 1] + cost[i];
            }else {
                pay2[i] = pay2[i - 2] + cost[i];
            }
        }
        int pay2_min = pay2[cl - 1] < pay2[cl - 2] ? pay2[cl - 1] : pay2[cl - 2];

        return pay1_min < pay2_min ? pay1_min : pay2_min;
    }
}