class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        ArrayList<Integer> integers = new ArrayList<>();
        int score = 0, len = tokens.length;
        Arrays.sort(tokens);
        for (int i = 0; i < len; i++) {
            integers.add(tokens[i]);
        }
        
        while(integers.size() > 1) {
            int front = integers.get(0), back = integers.get(integers.size() - 1);
            if (front <= power) {
                power -= front;
                score++;
                integers.remove(0);
                continue;
            }
            
            if (score > 0 && back + power > front) {
                power += back;
                score--;
                integers.remove(integers.size() - 1);
                continue;
            }
        
            break;
        }
        
        if (integers.size() == 1 && integers.get(0) <= power) {
            return score + 1;
        }
        
        return score;
    }
}