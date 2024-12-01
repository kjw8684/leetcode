class Solution {
    public boolean checkIfExist(int[] arr) {
        int len = arr.length;

        for(int i = 0; i < len; i++) {
            for(int j = i + 1; j < len; j++) {
                if(arr[i] == 2 * arr[j] || arr[j] == 2 * arr[i]) {
                    return true;
                }
            }
        }

        return false;
    }
}