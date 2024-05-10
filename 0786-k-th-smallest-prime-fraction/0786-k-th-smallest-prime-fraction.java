class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        Comparator<Pair<Double, Pair<Integer, Integer>>> comparator = new Comparator<Pair<Double, Pair<Integer, Integer>>>() {
            public int compare(Pair<Double, Pair<Integer, Integer>> pair1, Pair<Double, Pair<Integer, Integer>> pair2) {
                // Double 값을 기준으로 오름차순으로 정렬
                return pair1.getKey().compareTo(pair2.getKey());
            }
        };
        int len = arr.length, count = 1;
        Set<Pair<Double, Pair<Integer, Integer>>> list = new TreeSet<>(comparator);
        
        for(int i = 0; i < len; i++) {
            for(int j = i; j < len; j++) {
                list.add(new Pair<>((double) arr[i] / (double) arr[j], new Pair<>(arr[i], arr[j])));
            }
        }
        
        for (Pair<Double, Pair<Integer, Integer>> pair : list) {
            if(count == k) {
                return new int[]{pair.getValue().getKey(), pair.getValue().getValue()};
            }
            count++;
        }
        
        return new int[]{-1,-1};
    }
}