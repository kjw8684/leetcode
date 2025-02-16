class Solution {
    int len, num;
    boolean[] cheak;
    public int[] constructDistancedSequence(int n) {
        num = n;
        len = 2 * n - 1;
        int[] answer = new int[len];
        cheak = new boolean[n + 1];

        find(answer, 0);

        return answer;
    }

    public boolean find(int[] answer, int index) {
        for(int i = index; i < len; i++) {
            if(answer[i] == 0) {
                for(int j = num; j > 1; j--) {
                    if(i + j < len && !cheak[j] && answer[i + j] == 0) {
                        cheak[j] = true;
                        answer[i] = j;
                        answer[i + j] = j;
                        if(find(answer, i + 1)) {
                            return true;
                        }
                        cheak[j] = false;
                        answer[i] = 0;
                        answer[i + j] = 0;
                    }
                }

                if(!cheak[1]) {
                    cheak[1] = true;
                    answer[i] = 1;
                    if(find(answer, i + 1)) {
                        return true;
                    }
                    cheak[1] = false;
                    answer[i] = 0;
                }

                return false;
            }
        }

        return true;
    }
}