class Solution {
    public int minNumberOperations(int[] target) {
        int len = target.length, answer = target[0];

        for(int i = 1; i < len; i++) {
            if(target[i - 1] < target[i]) {
                answer += target[i] - target[i - 1];
            }
        }

        return answer;
    }
}