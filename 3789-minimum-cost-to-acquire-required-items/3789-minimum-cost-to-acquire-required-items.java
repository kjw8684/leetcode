class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long answer = 0L;

        if(cost1 + cost2 > costBoth) {
            int min = Math.min(need1, need2);

            answer += (long)costBoth * min;
            need1 -= min;
            need2 -= min;
        }

        if(cost1 >= costBoth && need1 > 0) {
            answer += (long)costBoth * need1;
            need2 -= need1;
            need1 = 0; 
        }
        if(cost2 >= costBoth && need2 > 0) {
            answer += (long)costBoth * need2;
            need1 -= need2;
            need2 = 0;
        }
        if(need1 > 0){
            answer += (long)cost1 * need1;
        }
        if(need2 > 0) {
            answer += (long)cost2 * need2;
        }

        return answer;
    }
}