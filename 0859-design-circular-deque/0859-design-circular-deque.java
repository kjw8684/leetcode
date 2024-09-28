class MyCircularDeque {
    Deque<Integer> deque;
    int size, index = 0;
    public MyCircularDeque(int k) {
        deque = new LinkedList<>();
        size = k;
    }
    
    public boolean insertFront(int value) {
        if(index != size) {
            deque.addFirst(value);
            index++;
            return true;
        }
        return false;
    }
    
    public boolean insertLast(int value) {
        if(index != size) {
            deque.addLast(value);
            index++;
            return true;
        }
        return false;
    }
    
    public boolean deleteFront() {
        if(deque.pollFirst() == null) {
            return false;
        }
        index--;
        return true;
    }
    
    public boolean deleteLast() {
        if(deque.pollLast() == null) {
            return false;
        }
        index--;
        return true;
    }
    
    public int getFront() {
        if(index != 0) {
            return deque.peekFirst();
        }
        return -1;
    }
    
    public int getRear() {
        if(index != 0) {
            return deque.peekLast();
        }
        return -1;
    }
    
    public boolean isEmpty() {
        if(index == 0) {
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if(size == index) {
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */