class Solution {
    public int minFlips(String s) {
        int len = s.length();
        int[] op = {0, 0};
        
        for(int i = 0; i < len; i++) {
            op[(s.charAt(i) ^ i) & 1]++;
        }

        int res = Math.min(op[0], op[1]);

        for(int i = 0; i < len - 1; i++) {
            op[(s.charAt(i) ^ i) & 1]--;
            op[(s.charAt(i) ^ (len + i)) & 1]++;
            res = Math.min(res, Math.min(op[0], op[1]));
        }

        return res;
    }
}