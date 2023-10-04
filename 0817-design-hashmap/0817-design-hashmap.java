class MyHashMap {
    int[] numbers = new int[1000001];

    public MyHashMap() {
        Arrays.fill(numbers, -1);
    }
    
    public void put(int key, int value) {
        numbers[key] = value;
    }
    
    public int get(int key) {
        return numbers[key];
    }
    
    public void remove(int key) {
        numbers[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */