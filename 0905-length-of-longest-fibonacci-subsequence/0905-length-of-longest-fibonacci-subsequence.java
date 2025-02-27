class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int len = arr.length, max = 0, count = 2, first = 0, second = 0, find = -1;

        for(int num : arr) {
            set.add(num);
        }

        for(int i = 0; i < len; i++) {
            for(int j = i + 1; j < len; j++) {
                first = arr[i];
                second = arr[j];
                count = 2;
                find = first + second;
                while(set.contains(find)) {
                    count++;
                    first = second;
                    second = find;
                    find = first + second;
                }
                max = Math.max(max, count);
            }
        }

        if(max < 3) {
            return 0;
        }
        return max;
    }
}