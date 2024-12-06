class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int len = banned.length, sum = 0, count = 0;
        boolean finised = true;
        HashSet<Integer> set = new HashSet<>();

        for(int cur : banned) {
            set.add(cur);
        }

        for(int i = 1; i <= n; i++) {
            if(set.contains(i)) {
                continue;
            }
            sum += i;
            count++;

            if(sum > maxSum) {
                finised = false;
                break;
            }
        }

        return finised ? count : count - 1;
    }
}