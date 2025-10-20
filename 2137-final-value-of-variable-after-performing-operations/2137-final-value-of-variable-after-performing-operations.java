class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int answer = 0;
        for(String cur : operations) {
            if(cur.charAt(0) == '+' || cur.charAt(2) == '+') {
                answer++;
            }
            else {
                answer--;
            }
        }

        return answer;
    }
}