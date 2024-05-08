class Solution {
    public String[] findRelativeRanks(int[] score) {
        int len = score.length;
        Integer[] sort = IntStream.of(score).boxed().toArray(Integer[]::new);
        String[] answer = new String[len];
        
        Arrays.sort(sort, Comparator.reverseOrder());
        
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(score[i] == sort[j]) {
                    if(j == 0) {
                        answer[i] = "Gold Medal";
                    }
                    else if(j == 1) {
                        answer[i] = "Silver Medal";
                    }
                    else if(j == 2) {
                        answer[i] = "Bronze Medal";
                    }
                    else {
                        answer[i] = Integer.toString(j + 1);
                    }
                    break;
                }
            }
        }
        
        return answer;
    }
}