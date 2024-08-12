class KthLargest {
    List<Integer> list = new ArrayList<>();
    int num = 0;
    public KthLargest(int k, int[] nums) {
        num = k - 1;

        for (int i : nums) {
            list.add(i);
        }
        Collections.sort(list, Collections.reverseOrder());
    }
    
    public int add(int val) {
        list.add(val);
        Collections.sort(list, Collections.reverseOrder());

        return list.get(num);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */