class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        long x = 0;
        List<Boolean> answer = new ArrayList<>();

        for(int num : nums) {
            x *= 2;
            x += num;

            x %= 10;

            if(x % 5 == 0) {
                answer.add(true);
            }
            else {
                answer.add(false);
            }
        }

        return answer;
    }
}