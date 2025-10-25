class Solution {
    public int totalMoney(int n) {
        int count = n / 7, left = n % 7, answer = 28 * count;

        for(int i = 1; i < count; i++) {
            answer += 7 * i;
        }


        for(int i = 0; i < left; i++) {
            answer += i + count + 1;
        }

        return answer;
    }
}