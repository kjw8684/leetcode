class Solution {
    public int[] minOperations(String boxes) {
        int len = boxes.length(), count = 0, sum = 0;
        int[] answer = new int[len];

        for(int i = 0; i < len; i++) {
            sum += count;
            answer[i] += sum;
            if(boxes.charAt(i) == '1') {
                count++;
            }
        }

        sum = 0;
        count = 0;
        for(int i = len - 1; i >= 0; i--) {
            sum += count;
            answer[i] += sum;
            if(boxes.charAt(i) == '1') {
                count++;
            }
        }

        return answer;
    }
}