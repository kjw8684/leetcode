class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<String> stack = new Stack<>();
        String[] peek = new String[2];
        int len = temperatures.length, index = 0, value = 0;
        int[] answer = new int[len];
        
        for (int i = 0; i < len; i++) {
            if (stack.isEmpty()) {
                stack.push(String.valueOf(i) + " " + String.valueOf(temperatures[i]));
                continue;
            }

            while (!stack.isEmpty()) {
                peek = stack.peek().split(" ");
                if (Integer.parseInt(peek[1]) < temperatures[i]) {
                    stack.pop();
                    answer[Integer.parseInt(peek[0])] = i - Integer.parseInt(peek[0]);
                    continue;
                }
                break;
            }
            
            stack.push(String.valueOf(i) + " " + String.valueOf(temperatures[i]));
        }

        return answer;
    }
}