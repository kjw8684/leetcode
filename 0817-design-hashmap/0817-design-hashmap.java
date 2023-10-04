class MyHashMap {
    ArrayList<Integer> numbers = new ArrayList<>();

    public MyHashMap() {
        for (int i = 0; i < 1000001; i++) {
            numbers.add(-1);
        }
    }
    
    public void put(int key, int value) {
        numbers.set(key, value);
    }
    
    public int get(int key) {
        return numbers.get(key);
    }
    
    public void remove(int key) {
        numbers.set(key, -1);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */