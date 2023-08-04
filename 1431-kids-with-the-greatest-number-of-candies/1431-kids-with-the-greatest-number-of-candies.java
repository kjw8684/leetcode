class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> answer = new ArrayList<Boolean>();
        int max = 0;
        for(int i = 0; i < candies.length; i++){
            if(max < candies[i])
                max = candies[i];
        }
        for(int i = 0; i < candies.length; i++){
            if(max <= candies[i] + extraCandies){
                answer.add(true);
            }else{answer.add(false);}
        }
        return answer;
    }
}