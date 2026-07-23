class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int len = nums.length, answer = 2;
        if(len < 3) {
            return len;
        }

        while(answer <= len) {
            answer *= 2;
        }

        return answer;
    }
}