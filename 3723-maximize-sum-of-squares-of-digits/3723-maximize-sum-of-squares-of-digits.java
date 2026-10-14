class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder sb = new StringBuilder();
        if(num * 9 < sum) {
            return "";
        }

        if(sum >= 9) {
            sb.repeat('9', sum / 9);
            num -= sum / 9;
            sum %= 9;
        }
        if(sum != 0) {
            sb.append(sum);
            num--;
            sum = 0;
        }
        sb.repeat('0', num);

        return sb.toString();
    }
}