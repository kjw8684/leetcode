class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int len = nums.length, count = 0, index = -1;
        boolean[] cheak = new boolean[len];

        for(int i = 0; i < len; i++) {
            count = 0;
            index = -1;
            for(int j = 0; j < len; j++) {
                if(nums[i].charAt(j) == '0') {
                    count++;
                    index = j;
                }
                if(count == 2) {
                    break;
                }
            }

            if(count == 1) {
                cheak[index] = true;
            }

        }

        index = -1;
        for(int i = 0; i < len; i++) {
            if(!cheak[i]) {
                index = i;
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        if(index == -1) {
            for(int i = 0; i < len; i++) {
                sb.append("1");
            }
        }
        else {
            for(int i = 0; i < len; i++) {
                if(i != index) {
                    sb.append("1");
                }
                else {
                    sb.append("0");
                }
            }
        }

        return sb.toString();
    }
}