class Solution {
    public double angleClock(int hour, int minutes) {
        double mAngle = minutes * 6, hAngle = (hour * 30) + (minutes * 0.5), diff = 0;

        if(mAngle > hAngle) {
            diff = mAngle - hAngle;
        }
        else {
            diff = hAngle - mAngle;
        }

        if(diff > 180) {
            return 360 - diff;
        }

        return diff;
    }
}