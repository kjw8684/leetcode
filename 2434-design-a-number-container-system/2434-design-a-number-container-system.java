class NumberContainers {
    HashMap<Integer, Integer> indexMap;
    HashMap<Integer, TreeSet<Integer>> valueMap;
    public NumberContainers() {
        indexMap = new HashMap<>();
        valueMap = new HashMap<>();
    }
    
    public void change(int index, int number) {
        if(indexMap.containsKey(index)) {
            valueMap.get(indexMap.get(index)).remove(index);
        }
        if(!valueMap.containsKey(number)) {
            valueMap.put(number, new TreeSet<>());
        }
        valueMap.get(number).add(index);
        indexMap.put(index, number);
    }
    
    public int find(int number) {
        if(valueMap.containsKey(number) && valueMap.get(number).size() > 0) {
            return valueMap.get(number).first();
        }

        return -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */