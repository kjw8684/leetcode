class Solution {
    public int findLucky(int[] arr) {
        int len = arr.length, poll = -1, count = 0;
        Arrays.sort(arr);

        for(int i = len - 1; i >= 0; i--) {
            if(poll == arr[i]) {
                count++;
            }
            else if(poll == count) {
                return poll;
            }
            else {
                poll = arr[i];
                count = 1;
            }
        }

        return poll == count ? poll : -1;
    }
}