class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int len = arr.length;
        Map<Integer, Integer>map = new HashMap<>();
        int[] sort = new int[len];
        int[] answer = new int[len];
        if(len == 0) {
            return answer;
        }

        for(int i = 0; i < len; i++) {
            sort[i] = arr[i];
        }
        Arrays.sort(sort);

        int before = sort[0] + 1, count = 1;

        for(int i = 0; i < len; i++) {
            if(before != sort[i]) {
                map.put(sort[i], count);
                count++;
            }
            before = sort[i];
        }

        for(int i = 0; i < len; i++) {
            answer[i] = map.get(arr[i]);
        }

        return answer;
    }
}