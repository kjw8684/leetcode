class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder sb = new StringBuilder();

        for(int i = 9; i > 0; i--) {
            if(sum - i >= 0) {
                sb.append(i);
                sum -= i;
                break;
            }
        }
        if(sb.length() == 0) {
            return "";
        }

        for(int i = 1; i < num; i++) {
            for(int j = 9; j >= 0; j--) {
                if(sum - j >= 0) {
                    sb.append(j);
                    sum -= j;
                    break;
                }
            }
        }

        if(sum > 0) {
            return "";
        }

        return sb.toString();
    }
}