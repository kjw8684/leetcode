class ProductOfNumbers {
    List<Integer> list;
    int len = 0;
    public ProductOfNumbers() {
        list = new ArrayList<>();
    }
    
    public void add(int num) {
        list.add(num);
        len++;
    }
    
    public int getProduct(int k) {
        int sum = 1, end = len - k;
        for(int i = len - 1; i >= end; i--) {
            sum *= list.get(i);
        }
        return sum;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */