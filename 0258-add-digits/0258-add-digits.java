class Solution {
    public int addDigits(int num) {
        int answer;
        while(true){
            answer = 0;
            if(num < 10){return num;}
            while(num > 0){
                answer += (num % 10);
                num /= 10;
            }
            num = answer;
        }
    }
}