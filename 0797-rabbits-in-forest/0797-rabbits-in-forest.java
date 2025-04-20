class Solution {
    public int numRabbits(int[] answers) {
        int len = answers.length, answer = 0;
        Arrays.sort(answers);
        len = answers[len - 1] + 1;

        int[] count = new int[len];

        for(int num : answers) {
            count[num]++;
        }

        for(int i = 0; i < len; i++) {
            if(count[i] != 0) {
                int div = count[i] / (i + 1);
                if(count[i] % (i + 1) != 0) {
                    div++;
                }
                answer += div * (i + 1);
            }
        }

        return answer;
    }
}