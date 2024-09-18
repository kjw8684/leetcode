class Solution {
    public String largestNumber(int[] nums) {
        int len = nums.length;
        String[] number = new String[len];
        StringBuilder sb = new StringBuilder();
        boolean allzero = true;

        for(int i = 0; i < len; i++) {
            number[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(number, (s1, s2) -> {
            String temp1 = s1 + s2, temp2 = s2 + s1;
            return temp1.compareTo(temp2);
        });

        for(int i = len - 1; i >= 0; i--) {
            if(number[i].compareTo("0") != 0) {
                allzero = false;
            }
            sb.append(number[i]);
        }
        if(allzero) {
            return "0";
        }

        return sb.toString();
    }
}