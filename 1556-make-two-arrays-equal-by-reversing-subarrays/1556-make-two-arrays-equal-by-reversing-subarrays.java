class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);

        int len = target.length;

        for(int i = 0; i < len; i++) {
            if(target[i] != arr[i]) {
                return false;
            }
        }

        return true;
    }
}