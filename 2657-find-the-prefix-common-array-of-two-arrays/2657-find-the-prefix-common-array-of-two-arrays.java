class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int len = A.length, answer = 0;
        int[] count = new int[51];
        int[] C = new int[len];

        for(int i = 0; i < len; i++) {
            count[A[i]]++;
            count[B[i]]++;


            if(A[i] == B[i]) {
                answer++;
                C[i] = answer;
                continue;
            }
            if(count[A[i]] > 1) {
                answer++;
            }
            if(count[B[i]] > 1) {
                answer++;
            }

            C[i] = answer;
        }

        return C;
    }
}