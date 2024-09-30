class CustomStack {
    int[] stack;
    int max, index = 0;

    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        max = maxSize;
    }
    
    public void push(int x) {
        if(index != max) {
            stack[index] = x;
            index++;
        }
    }
    
    public int pop() {
        if(index == 0) {
            return -1;
        }
        else {
            index--;
            return stack[index];
        }
    }
    
    public void increment(int k, int val) {
        for(int i = 0; i < k && i < index; i++) {
            stack[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */