class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int len = derived.length;
        boolean answer = true;

        for(int i = 0; i < len; i++) {
            if(derived[i] == 1) {
                answer = !answer;
            }
        }

        return answer;
    }
}