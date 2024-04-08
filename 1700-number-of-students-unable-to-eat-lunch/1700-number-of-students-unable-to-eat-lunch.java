class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> student = new ArrayDeque<>(), sandwiche = new ArrayDeque<>();
        int len = students.length, count = 0;
        
        for(int i = 0; i < len; i++){
            student.offer(students[i]);
            sandwiche.offer(sandwiches[i]);
        }
        
        while(student.size() > count) {
            if(student.peek() == sandwiche.peek()) {
                student.remove();
                sandwiche.remove();
                count = 0;
                continue;
            }
            student.offer(student.remove());
            count++;
        }
        
        return student.size();
    }
}