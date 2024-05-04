class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int len = people.length, answer = 0, max = 0;
        Arrays.sort(people);
        
        for (int i = 0; i < len; i++) {
            if(people[i] + people[i] <= limit) {
                for(int j = len - 1; j > i; j--) {
                    if(people[j] + people[i] <= limit) {
                        people[j] = limit + 1;
                        answer--;
                        break;
                    }
                }
            }
            answer++;
        }
        
        return answer;
    }
}