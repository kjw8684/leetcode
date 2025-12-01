class Solution {
    public long maxRunTime(int n, int[] batteries) {
        Arrays.sort(batteries);
        long sum = 0;
        for(int batterie : batteries) {
            sum += batterie;
        }

        for (int i = batteries.length - 1; i >= 0; i--) {
            if (batteries[i] <= sum / n) break;
            sum -= batteries[i];
            n--;
        }

        return sum / n;
    }
}