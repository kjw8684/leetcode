class Solution {
    public int maxBuilding(int n, int[][] restrictions) {

        List<int[]> list = new ArrayList<>();

        list.add(new int[]{1, 0});

        for(int[] r : restrictions)
            list.add(r);

        list.sort((a,b) -> Integer.compare(a[0], b[0]));

        if(list.get(list.size()-1)[0] != n)
            list.add(new int[]{n, n-1});

        int m = list.size();

        // left -> right
        for(int i=1;i<m;i++){
            list.get(i)[1] = Math.min(
                list.get(i)[1],
                list.get(i-1)[1]
                + list.get(i)[0]
                - list.get(i-1)[0]
            );
        }

        // right -> left
        for(int i=m-2;i>=0;i--){
            list.get(i)[1] = Math.min(
                list.get(i)[1],
                list.get(i+1)[1]
                + list.get(i+1)[0]
                - list.get(i)[0]
            );
        }

        long ans = 0;

        for(int i=1;i<m;i++){

            int x1 = list.get(i-1)[0];
            int h1 = list.get(i-1)[1];

            int x2 = list.get(i)[0];
            int h2 = list.get(i)[1];

            int dist = x2 - x1;

            long peak =
                Math.max(h1, h2)
                + (dist - Math.abs(h1 - h2)) / 2;

            ans = Math.max(ans, peak);
        }

        return (int)ans;
    }
}