class Solution {
    public int missingMultiple(int[] nums, int k) {
        int cur = 1;

        while(true) {
            boolean check = false;
            for(int num : nums) {
                if(k * cur == num) {
                    cur++;
                    check = true;
                    break;
                }
            }

            if(!check) {
                break;
            }
        }

        return k * cur;
    }
}