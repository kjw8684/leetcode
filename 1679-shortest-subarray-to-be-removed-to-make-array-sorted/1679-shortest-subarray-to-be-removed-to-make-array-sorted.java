class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int len = arr.length, left, right, remove;

        for(left = 0; left + 1 < len && arr[left] <= arr[left + 1]; left++);

        if(left == len - 1) {
            return 0;
        }

        for(right = len - 1; right > left && arr[right - 1] <= arr[right]; right--);

        remove = Math.min(len - left - 1, right);

        for(int i = 0, j = right; i <= left && j < len; ) {
            if(arr[i] <= arr[j]) {
                remove = Math.min(remove, j - i - 1);
                i++;
            }
            else {
                j++;
            }
        }

        return remove;
    }
}