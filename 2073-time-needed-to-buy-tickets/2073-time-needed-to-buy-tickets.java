class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int len = tickets.length, answer = 0, min, count, haveint = len;
        while(tickets[k] != 0) {
            count = 0;
            min = 101;
            for(int i = 0; i < len; i++) {
                if(min == tickets[i]) {
                    count++;
                    continue;
                }
                
                if(tickets[i] > 0 && min > tickets[i]) {
                    min = tickets[i];
                    count = 1;
                }
            }
            
            answer += haveint * min;
            haveint -= count;
            count = 0;
            
            for(int i = 0; i < len; i++) {
                if(tickets[i] > 0 && tickets[k] == 0) {
                    count++;
                }
                tickets[i] -= min;
            }
            answer -= count;
        }
        
        return answer;
    }
}