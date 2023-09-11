class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> Answer = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int count = 0, size = 0;
        boolean check = true;
        while(true){
            check = true;
            for(int i = 0; i < groupSizes.length; i++){
                if(groupSizes[i] == 0){
                    continue;
                }
                check = false;
                if(count == 0){
                    size = groupSizes[i];
                    count = size - 1;
                    temp = new ArrayList<>();
                    temp.add(i);
                    groupSizes[i] = 0;
                    if(count == 0){
                        Answer.add(temp);
                    }
                }
                else{
                    if(groupSizes[i] == size){
                        temp.add(i);
                        count--;
                        groupSizes[i] = 0;
                        if(count == 0){
                            Answer.add(temp);
                        }
                    }
                }
            }
            if(check){
                break;
            }
        }
        return Answer;
    }
}