class Solution {
    public int leastInterval(char[] tasks, int n) {
        int answer = 0, len = tasks.length, count = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < len; i++) {
            if(!map.containsKey(tasks[i])) {
                map.put(tasks[i], 1);
                count++;
                continue;
            }
            map.put(tasks[i], map.get(tasks[i]) + 1);
        }

        Integer[] task = new Integer[count];
        int[] interval = new int[count];
        int i = 0, current = 0, max = 0;

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            task[i] = entry.getValue();
            i++;
        }

        Arrays.sort(task, (e1, e2) -> e2 - e1);

        for(i = 0; i < len; i++) {
            max = 0;
            for(int j = 0; j < count; j++) {
                if(max < task[j] && interval[j] == 0) {
                    max = task[j];
                    current = j;
                }
            }
            if(max > 0) {
                task[current]--;
                interval[current] = n + 1;
            }

            if(max == 0) {
                i--;
            }

            for(int j = 0; j < count; j++) {
                if(interval[j] > 0) {
                    interval[j]--;
                }
            }

            answer++;
        }

        return answer;
    }
}