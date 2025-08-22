class Solution {
    public int[] productQueries(int n, int[][] queries) {
        int[] power2 = new int[32];
        for(int i = 0; i < 32; i++) {
            power2[i] = (int)Math.pow(2, i);
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 31; i >= 0; i--) {
            if(n >= power2[i]) {
                n -= power2[i];
                list.add(power2[i]);
            }
            if(n == 0) {
                break;
            }
        }

        int len = list.size();
        int[] power = new int[len];

        for(int i = 0; i < len; i++) {
            power[i] = list.get(i);
        }

        Arrays.sort(power);

        len = queries.length;
        int[] answer = new int[len];

        for(int i = 0; i < len; i++) {
            long cur = 1;
            for(int j = queries[i][0]; j <= queries[i][1]; j++) {
                cur *= power[j];
                cur %= 1000000007;
            }

            answer[i] = (int)cur;
        }

        return answer;
    }
}