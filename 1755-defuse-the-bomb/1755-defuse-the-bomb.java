class Solution {
    public int[] decrypt(int[] code, int k) {
        int len = code.length;
        int[] answer = new int[len];

        if(k == 0) {
            return answer;
        }
        else if(k > 0) {
            for(int i = 0; i < len; i++) {
                for(int j = i + 1, count = 0; count < k; j++, count++) {
                    if(j == len) {
                        j -= len;
                    }
                    answer[i] += code[j];
                }
            }

            return answer;
        }
        else {
            for(int i = 0; i < len; i++) {
                for(int j = i - 1, count = 0; count > k; j--, count--) {
                    if(j == -1) {
                        j += len;
                    }
                    answer[i] += code[j];
                }
            }

            return answer;
        }

    }
}