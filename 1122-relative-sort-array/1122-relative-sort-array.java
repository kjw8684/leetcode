class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Integer[] integerarr1 = Arrays.stream(arr1).boxed().toArray(Integer[]::new);
        List<Integer> list = Arrays.stream(arr2).boxed().collect(Collectors.toList());
        
        Arrays.sort(integerarr1, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                int ia = list.indexOf(a), ib = list.indexOf(b);
                if(ia == -1 && ib == -1) {
                    return a - b;
                }
                if(ia == -1) {
                    return 1;
                }
                if(ib == -1) {
                    return -1;
                }
                
                return ia - ib;
            }
        });
        
        return Arrays.stream(integerarr1).mapToInt(Integer::intValue).toArray();
    }    
}