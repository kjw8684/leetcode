class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> answer = new ArrayList<>();
        int len = arr.length, min = 2000000;
        Arrays.sort(arr);

        for(int i = 1; i < len; i++) {
            int cur = arr[i] - arr[i - 1];
            if(cur < min) {
                answer.clear();
                min = cur;
                answer.add(new ArrayList<>(Arrays.asList(arr[i - 1], arr[i])));
            }
            else if(cur == min) {
                answer.add(new ArrayList<>(Arrays.asList(arr[i - 1], arr[i])));
            }
        }

        return answer;
    }
}