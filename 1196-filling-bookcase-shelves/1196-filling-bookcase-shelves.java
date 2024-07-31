class Solution {
    public int minHeightShelves(int[][] books, int shelfWidth) {
        int len = books.length;
        int[] dynamic = new int[len + 1];

        for(int i = 1; i <= len; i++) {
            int w = books[i - 1][0], h = books[i - 1][1];
            dynamic[i] = dynamic[i - 1] + h;
            for(int j = i - 1; j > 0; j--) {
                w += books[j - 1][0];
                if(w > shelfWidth) {
                    break;
                }
                h = Math.max(h, books[j - 1][1]);
                dynamic[i] = Math.min(dynamic[i], dynamic[j - 1] + h);
            }
        }

        return dynamic[len];
    }
}