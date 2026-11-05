class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Set<Integer> set = new HashSet<>();
        int count = 0;

        for(int num : arr2) {
            set.add(num);
        }

        for(int num : arr1) {
            boolean cur = true;
            for(int i = 0; i <= d; i++) {
                if(set.contains(num + i) || set.contains(num - i)) {
                    cur = false;
                    break;
                }
            }

            if(cur) {
                count++;
            }
        }

        return count;
    }
}