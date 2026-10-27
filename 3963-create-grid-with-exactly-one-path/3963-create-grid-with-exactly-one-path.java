class Solution {
    public String[] createGrid(int m, int n) {
        String[] map = new String[m];
        String rest = "#".repeat(n - 1) + ".";
        map[0] = ".".repeat(n);

        for(int i = 1; i < m; i++) {
            map[i] = rest;
        }

        return map;
    }
}