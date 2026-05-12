class Solution {
    public int minimumEffort(int[][] tasks) {
        int left = 0, count = 0;

        Arrays.sort(tasks, (o1, o2) -> {
            return Integer.compare(o2[1] - o2[0], o1[1] - o1[0]);
        });

        for(int[] task : tasks) {
            if(left < task[1]) {
                count += task[1] - left;
                left = task[1];
            }
            if(left < task[0]) {
                count += task[0] - left;
                left = task[0];
            }

            left -= task[0];
        }

        return count;
    }
}