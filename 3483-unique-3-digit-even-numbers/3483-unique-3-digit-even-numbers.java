class Solution {
    public int totalNumbers(int[] digits) {
        int[] count = new int[10];
        int variation = 0, answer = 0;

        for(int num : digits) {
            count[num]++;
            if(count[num] == 1) {
                variation++;
            }
        }

        for(int i = 1; i < 10; i++) {
            count[i]--;
            if(count[i] == 0) {
                variation--;
            }
            for(int j = 0; j < 10; j += 2) {
                count[j]--;
                if(count[i] < 0 || count[j] < 0) {
                    count[j]++;
                    continue;
                }

                if(count[j] == 0) {
                    variation--;
                }
                answer += variation;
                if(count[j] == 0) {
                    variation++;
                }
                count[j]++;
            }
            if(count[i] == 0) {
                variation++;
            }
            count[i]++;
        }

        return answer;
    }
}