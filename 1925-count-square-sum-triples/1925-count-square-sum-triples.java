class Solution {
    public int countTriples(int n) {
        Set<Integer> set = new HashSet<>();
        int count = 0;

        for(int i = 1; i <= n; i++) {
            set.add(i * i);
        }

        for(int i = 1; i < n; i++) {
            for(int j = 1; j < n; j++) {
                int cur = i * i + j * j;
                if(set.contains(cur)) {
                    count++;
                }
            }
        }

        return count;
    }
}