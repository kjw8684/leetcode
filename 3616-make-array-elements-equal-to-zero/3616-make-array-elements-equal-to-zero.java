class Solution {
    public int countValidSelections(int[] nums) {
        int sum = 0;

        for(int num : nums) {
            sum += num;
        }

        int cur = 0, answer = 0;
        for(int num : nums) {
            cur += num;
            sum -= num;
            if(num == 0) {
                if(cur == sum) {
                    answer += 2;
                }

                else if(cur + 1 == sum || cur == sum + 1) {
                    answer++;
                }
            }
            
        }

        return answer;
    }
}