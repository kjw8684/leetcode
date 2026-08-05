class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<Integer> answer = new ArrayList<>();
        List<List<Integer>> map = new ArrayList<>();
        boolean[] visited = new boolean[n];
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++) {
            map.add(new ArrayList<>());
        }

        for(int[] cur : invocations) {
            map.get(cur[0]).add(cur[1]);
        }

        set.add(k);
        check(k, map, set);

        for(int[] cur : invocations) {
            if(!set.contains(cur[0]) && set.contains(cur[1])) {
                for(int i = 0; i < n; i++) {
                    answer.add(i);
                }
                return answer;
            }
        }

        for(int i = 0; i < n; i++) {
            if(!set.contains(i)) {
                answer.add(i);
            }
        }

        return answer;
    }

    private void check(int cur, List<List<Integer>> map, Set<Integer> set) {
        for(Integer e : map.get(cur)) {
            if(!set.contains(e)) {
                set.add(e);
                check(e, map, set);
            }
        }
    }
}