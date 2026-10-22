class Solution {
    public int minOperations(int[] nums) {
        int len = nums.length, up = 0, down = 0, before = nums[0];
        boolean upsort = false, downsort = false;

        for(int i = 1; i < len * 2; i++) {
            int cur = nums[i % len];
            if(up == i % len) {
                upsort = true;
            }
            if(down == i % len) {
                downsort = true;
            }
            if(!downsort && before < cur) {
                down = i % len;
            }
            if(!upsort && before > cur) {
                up = i % len;
            }
            before = cur;
        }

        if(!upsort && !downsort) {
            return -1;
        }

        up = Math.min(up, len - up + 2);
        down = Math.min(down + 1, len - down + 1);

        if(upsort && downsort) {
            return Math.min(up, down);
        }

        if(upsort) {
            return up;
        }

        return down;
    }
}