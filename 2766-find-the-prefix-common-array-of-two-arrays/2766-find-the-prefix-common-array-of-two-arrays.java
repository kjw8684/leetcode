class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int len = A.length, count = 0;
        int[] a = new int[51];
        int[] b = new int[51];
        int[] answer = new int[len];

        for(int i = 0; i < len; i++) {
            if(A[i] == B[i]) {
                count++;
            }
            else {
                a[A[i]]++;
                if(a[A[i]] <= b[A[i]]) {
                    count++;
                }
                b[B[i]]++;
                if(a[B[i]] >= b[B[i]]) {
                    count++;
                }
            }
            answer[i] = count;
        }

        return answer;
    }
}