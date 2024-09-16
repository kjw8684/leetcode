class Solution {
    public int findMinDifference(List<String> timePoints) {
        int len = timePoints.size(), min = 1440;
        Collections.sort(timePoints);

        for(int i = 1; i < len; i++) {
            min = Math.min(min, cal(timePoints.get(i - 1), timePoints.get(i)));
        }
        min = Math.min(min, last(timePoints.get(len - 1), timePoints.get(0)));

        return min;
    }

    public int cal(String a, String b) {
        int result = 0;
        result += ((b.charAt(0) - '0') - (a.charAt(0) - '0')) * 600;
        result += ((b.charAt(1) - '0') - (a.charAt(1) - '0')) * 60;
        result += ((b.charAt(3) - '0') - (a.charAt(3) - '0')) * 10;
        result += (b.charAt(4) - '0') - (a.charAt(4) - '0');

        return result;
    }

    public int last(String a, String b) {
        int result = 0;
        result += ((b.charAt(0) - '0' + 2) - (a.charAt(0) - '0')) * 600;
        result += ((b.charAt(1) - '0' + 4) - (a.charAt(1) - '0')) * 60;
        result += ((b.charAt(3) - '0') - (a.charAt(3) - '0')) * 10;
        result += (b.charAt(4) - '0') - (a.charAt(4) - '0');

        return result;
    }
}