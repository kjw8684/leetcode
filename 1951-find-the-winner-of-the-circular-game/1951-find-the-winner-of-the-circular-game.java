class Solution {
    public int findTheWinner(int n, int k) {
        int current = 0, div = 0;
        boolean[] cheak = new boolean[n];
        for(int i = 0; i < n - 1; i++) {
            div = k % (n - i);
            if(div == 0) {
                div = n - i;
            }
            current = search(cheak, current, div, n);
        }

        return current + 1;
    }

    public int search(boolean[] cheak, int current, int div, int n) {
        for(int i = 0; i < div; i++) {
            if(cheak[current]) {
                i--;
            }

            if(i == div - 1) {
                cheak[current] = true;
            }
            current++;
            if(current == n) {
                current = 0;
            }
        }
        while (cheak[current]) {
            current++;
            if(current == n) {
                current = 0;
            }
        }
        return current;
    }
}