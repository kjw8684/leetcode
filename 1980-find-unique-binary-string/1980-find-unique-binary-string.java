class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int len = nums.length;
        Set<String>set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < len; i++) {
            set.add(nums[i]);
            sb.append("0");
        }

        if(!set.contains(sb.toString())) {
            return sb.toString();
        }

        for(int i = 0; i < len; i++) {
            sb.setCharAt(i, '1');
            if(!set.contains(sb.toString())) {
                return sb.toString();
            }
            sb.setCharAt(i, '0');
        }

        return sb.toString();
    }
}