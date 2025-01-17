class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int len = derived.length, original = 0;

        for(int i = 0; i < len; i++) {
            if(derived[i] == 1) {
                original = Math.abs(original - 1);
            }
        }

        return original == 0;
    }
}