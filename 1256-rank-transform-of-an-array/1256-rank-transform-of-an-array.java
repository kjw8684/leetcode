class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int len = arr.length, index = 2;
        if(len == 0) {
            return arr;
        }
        int[] copy = Arrays.copyOf(arr, len);
        Arrays.sort(copy);
        Map<Integer, Integer> map = new HashMap<>();
        map.put(copy[0], 1);

        for(int i = 1; i < len; i++) {
            if(copy[i] != copy[i - 1]) {
                map.put(copy[i], index);
                index++;
            }
        }

        for(int i = 0; i < len; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}