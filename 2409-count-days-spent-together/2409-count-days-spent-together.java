class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] month = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int arrive = Math.max(change(month, arriveAlice), change(month, arriveBob)), leave = Math.min(change(month, leaveAlice), change(month, leaveBob)) + 1;
        
        return Math.max(0, leave - arrive);
    }

    private int change(int[] month, String date) {
        int day = 0;
        if(date.charAt(0) == '1') {
            int m = 10 + date.charAt(1) - '0';
            for(int i = 1; i < m; i++) {
                day += month[i - 1];
            }
        }
        else {
            int m = date.charAt(1) - '0';
            for(int i = 1; i < m; i++) {
                day += month[i - 1];
            }
        }

        day += (date.charAt(3) - '0') * 10;
        day += date.charAt(4) - '0';

        return day;
    }
}