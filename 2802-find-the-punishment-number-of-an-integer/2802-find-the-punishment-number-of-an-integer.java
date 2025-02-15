class Solution {
    public int punishmentNumber(int n) {
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            if(cheak(Integer.toString(i * i), i)) {
                sum += i * i;
            }
        }

        return sum;
    }

    public boolean cheak(String s, int target) {
        if(s.equals("") && target == 0) {
            return true;
        }
        if(target < 0) {
            return false;
        }

        for(int i = 0; i < s.length(); i++) {
            String left = s.substring(0, i + 1), right = s.substring(i + 1);

            boolean isPossible = cheak(right, target - Integer.parseInt(left));

            if(isPossible) {
                return true;
            }
        }

        return false;
    }
}