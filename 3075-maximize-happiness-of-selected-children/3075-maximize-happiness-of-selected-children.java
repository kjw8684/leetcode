class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long answer = 0;
        
        Integer[] happy = Arrays.stream(happiness).boxed().toArray(Integer[]::new);
        Arrays.sort(happy, Collections.reverseOrder());
        
        for(int i = 0; i < k; i++) {
            if(happy[i] - i > 0) {
                answer += happy[i] - i;
            }
            else {
                break;
            }
        }
        
        return answer;
    }
}