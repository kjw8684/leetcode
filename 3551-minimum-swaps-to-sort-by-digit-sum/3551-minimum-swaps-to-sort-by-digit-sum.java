class Solution {
    public int minSwaps(int[] nums) {
        int len = nums.length;
        int[][] sort = new int[len][3];

        for(int i = 0; i < len; i++) {
            int cur = nums[i], sum = 0;
            sort[i][0] = cur;

            while(cur != 0) {
                sum += cur % 10;
                cur /= 10;
            }
            sort[i][1] = sum;
            sort[i][2] = i;
        }

        Arrays.sort(sort, (a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        int sum = 0;
        boolean[] visited = new boolean[len];
        for(int i = 0; i < len; i++) {
            int count = 1, cur = sort[i][2];
            visited[i] = true;
            while(!visited[cur]) {
                visited[cur] = true;
                cur = sort[cur][2];
                count++;
            }

            sum += count - 1;
        }

        return sum;
    }
}