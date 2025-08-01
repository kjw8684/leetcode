class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>());
        answer.get(0).add(1);

        for(int i = 1; i < numRows; i++) {
            answer.add(new ArrayList<>());
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    answer.get(i).add(1);
                }
                else {
                    answer.get(i).add(answer.get(i - 1).get(j - 1) + answer.get(i - 1).get(j));
                }
                
            }
        }

        return answer;
    }
}