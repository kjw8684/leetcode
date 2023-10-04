class MyHashMap {
    HashMap<Integer, Integer> numbers = new HashMap<>();

    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
        numbers.put(key, value);
    }
    
    public int get(int key) {
        return numbers.get(key) == null ? -1 : numbers.get(key);
    }
    
    public void remove(int key) {
        numbers.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */