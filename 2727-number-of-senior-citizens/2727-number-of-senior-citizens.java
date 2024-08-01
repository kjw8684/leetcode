class Solution {
    public int countSeniors(String[] details) {
        int len = details.length, sum = 0;

        for(int i = 0; i < len; i++) {
            if(Integer.parseInt(details[i].substring(11, 13)) > 60) {
                sum++;
            }
        }

        return sum;
    }
}