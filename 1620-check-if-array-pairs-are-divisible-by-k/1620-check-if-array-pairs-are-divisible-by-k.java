class Solution {
    public boolean canArrange(int[] arr, int k) {
        if(k == 1) {
            return true;
        }
        int len = arr.length, temp1 = k - 1, temp2 = 2 * k - 1, cur = 0;
        int[] cheak = new int[2 * k];

        for(int i = 0; i < len; i++) {
            cheak[k + (arr[i] % k)]++;
        }

        if(k == 2) {
            cur = Math.min(cheak[1], cheak[3]);
            if(cheak[1] == cur && cheak[3] == cur) {
                return true;
            }
            return false;
        }

        for(int i = 1; i < 2 * k; i++) {
            if(temp1 == 0) {
                temp1 = k - 1;
                temp2 = 2 * k - 1;
                continue;
            }

            if(i != temp1) {
                cur = Math.min(cheak[i], cheak[temp1]);
                cheak[i] -= cur;
                cheak[temp1] -= cur;
            }
            else {
                cur = Math.min(cheak[i], cheak[temp1]);
                if(cur % 2 == 1) {
                    cur--;
                }
                cheak[i] -= cur;
            }
            
            if(i != temp2) {
                cur = Math.min(cheak[i], cheak[temp2]);
                cheak[i] -= cur;
                cheak[temp2] -= cur;
            }
            else {
                cur = Math.min(cheak[i], cheak[temp2]);
                if(cur % 2 == 1) {
                    cur--;
                }
                cheak[i] -= cur;
            }

            temp1--;
            temp2--;
            if(cheak[i] > 0) {
                return false;
            }
        }

        return true;
    }
}