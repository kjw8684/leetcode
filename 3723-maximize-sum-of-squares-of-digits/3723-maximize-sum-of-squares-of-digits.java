class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder sb = new StringBuilder();
        if(num * 9 < sum) {
            return "";
        }

        for(int i = 0; i < num; i++) {
            if(sum >= 9) {
                sb.append("9");
                sum -= 9;
            }
            else if(sum > 0) {
                sb.append(sum);
                sum = 0;
            }
            else {
                sb.append("0");
            }
        }

        return sb.toString();
    }
}