class Solution {
    public int numTeams(int[] rating) {
        int count = 0, len = rating.length;

        for(int i = 0; i < len; i++) {
            for(int j = i + 1; j < len; j++) {
                if(rating[i] > rating[j]) {
                    continue;
                }
                for(int k = j + 1; k < len; k++) {
                    if(rating[k] > rating[j]) {
                        count++;
                    }
                }
            }
        }

        for(int i = 0; i < len; i++) {
            for(int j = i + 1; j < len; j++) {
                if(rating[i] < rating[j]) {
                    continue;
                }
                for(int k = j + 1; k < len; k++) {
                    if(rating[k] < rating[j]) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}