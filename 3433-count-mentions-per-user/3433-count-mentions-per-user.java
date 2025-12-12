class Solution {
    public int[] countMentions(int numberOfUsers, List<List<String>> events) {
        int[] offline = new int[numberOfUsers];
        int[] answer = new int[numberOfUsers];
        int len = events.size();

        events.sort((o1, o2) -> {
            int a = Integer.parseInt(o1.get(1)), b = Integer.parseInt(o2.get(1));
            if(a == b) {
                if(o1.get(0).equals("OFFLINE")) {
                    return -1;
                }
                else {
                    return 1;
                }
            }
            return a - b;
        });

        for(int i = 0; i < len; i++) {
            List<String> cur = events.get(i);
            if(cur.get(0).equals("OFFLINE")) {
                offline[Integer.parseInt(cur.get(2))] = Integer.parseInt(cur.get(1)) + 60;
            }
            else {
                if(cur.get(2).equals("ALL")) {
                    for(int j = 0; j < numberOfUsers; j++) {
                        answer[j]++;
                    }
                }
                else if(cur.get(2).equals("HERE")) {
                    for(int j = 0; j < numberOfUsers; j++) {
                        if(offline[j] <= Integer.parseInt(cur.get(1))) {
                            answer[j]++;
                        }
                    }
                }
                else {
                    String[] ids = cur.get(2).split(" ");
                    for(String id : ids) {
                        answer[Integer.parseInt(id.substring(2))]++;
                    }
                }
            }
        }

        return answer;
    }
}