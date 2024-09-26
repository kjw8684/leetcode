class MyCalendar {
    int[] s;
    int[] e;
    int count = 0;
    
    public MyCalendar() {
       s = new int[1000];
       e = new int[1000];
    }
    
    public boolean book(int start, int end) {
        boolean start_include = true, end_include = true, big = true;
        for (int i = 0; i < count; i++) {
            start_include = start >= s[i] && start < e[i];
            end_include = end > s[i] && end <= e[i];
            big = start < s[i] && end > e[i];
            if(start_include || end_include || big) {
                return false;
            }	
        }

        s[count] = start;
        e[count] = end;
        count++;
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */