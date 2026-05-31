class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long curmass = mass;
        Arrays.sort(asteroids);

        for(int asteroid : asteroids) {
            if(curmass >= asteroid) {
                curmass += asteroid;
            }
            else {
                return false;
            }
        }

        return true;
    }
}