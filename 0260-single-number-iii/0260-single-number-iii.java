import java.util.ArrayList;

class Solution {
    public int[] singleNumber(int[] nums) {
        int len = nums.length;
        ArrayList<Integer> number = new ArrayList<>();
        ArrayList<Integer> mul = new ArrayList<>();
        
        for(int i = 0; i < len; i++) {
            if(mul.contains(nums[i])) {
                continue;
            }
            
            if(number.contains(nums[i])) {
                number.remove(Integer.valueOf(nums[i]));
                mul.add(nums[i]);
                continue;
            }
            
            number.add(nums[i]);
        }
        
        int[] answer = new int[number.size()];
        
        for(int i = 0; i < number.size(); i++) {
            answer[i] = number.get(i);
        }
        
        return answer;
    }
}