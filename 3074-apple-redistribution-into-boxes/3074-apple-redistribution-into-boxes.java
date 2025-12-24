class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0, count = 0, index = capacity.length - 1;
        Arrays.sort(capacity);
        for(int cur : apple) {
            sum += cur;
        }
        
        while(sum > 0) {
            sum -= capacity[index];
            count++;
            index--;
        }

        return count;
    }
}