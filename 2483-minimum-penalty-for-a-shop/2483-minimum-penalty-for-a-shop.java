class Solution {
    public int bestClosingTime(String customers) {
        int len = customers.length(), count = 0;

        for(int i = 0; i < len; i++) {
            if(customers.charAt(i) == 'Y') {
                count++;
            }
        }

        int min = count, answer = 0;
        for(int i = 0; i < len; i++) {
            if(customers.charAt(i) == 'Y') {
                count--;
            }
            else {
                count++;
            }

            if(min > count) {
                min = count;
                answer = i + 1;
            }
        }

        return answer;
    }
}