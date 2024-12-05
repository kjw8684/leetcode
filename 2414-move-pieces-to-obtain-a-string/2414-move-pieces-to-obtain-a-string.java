class Solution {
    public boolean canChange(String start, String target) {
        if(start.replaceAll("_", "").compareTo(target.replaceAll("_", "")) != 0) {
            return false;
        }
        Queue<Character> queue = new LinkedList<>();
        int len = start.length();
        char scur = 'a', tcur = 'b';

        for(int i = 0; i < len; i++) {
            scur = start.charAt(i);
            tcur = target.charAt(i);
            if(queue.isEmpty()) {
                if(scur == 'L' && scur != tcur) {
                    return false;
                }
                if(tcur == 'R' && scur != tcur) {
                    return false;
                }

                if(scur != tcur) {
                    if(scur == 'R') {
                        queue.offer('R');
                    }
                    if(tcur == 'L') {
                        queue.offer('L');
                    }
                }
            }
            else {
                if(scur == 'L') {
                    if(queue.peek() == 'L') {
                        queue.poll();
                    }
                    else {
                        return false;
                    }
                }
                if(tcur == 'R') {
                    if(!queue.isEmpty() && queue.peek() == 'R') {
                        queue.poll();
                    }
                    else {
                        return false;
                    }
                }

                if(scur == 'R') {
                    queue.offer('R');
                }
                if(tcur == 'L') {
                    queue.offer('L');
                }
            }
        }

        return queue.isEmpty();
    }
}