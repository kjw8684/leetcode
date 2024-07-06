class Solution {
    public int passThePillow(int n, int time) {
        int way = time / (n - 1), position = time % (n - 1);

        if(way % 2 == 0) {
            return position + 1;
        }
        return n - position;
    }
}