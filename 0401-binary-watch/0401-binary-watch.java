class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        Map<Integer, List<String>> hour = new HashMap<>();
        Map<Integer, List<String>> minute = new HashMap<>();

        for(int i = 0; i < 12; i++) {
            int count = 0, cur = i;
            while(cur != 0) {
                if(cur % 2 == 1) {
                    count++;
                }
                cur /= 2;
            }
            
            hour.computeIfAbsent(count, k -> new ArrayList<>()).add("" + i);
        }

        for(int i = 0; i < 60; i++) {
            int count = 0, cur = i;
            while(cur != 0) {
                if(cur % 2 == 1) {
                    count++;
                }
                cur /= 2;
            }

            if(i < 10) {
                minute.computeIfAbsent(count, k -> new ArrayList<>()).add("0" + i);
            }
            else {
                minute.computeIfAbsent(count, k -> new ArrayList<>()).add("" + i);
            }
        }

        List<String> answer = new ArrayList<>();
        for(int i = 0; i <= turnedOn; i++) {
            if(hour.get(i) == null || minute.get(turnedOn - i) == null) {
                continue;
            }
            for (String h : hour.get(i)) {
                for(String m : minute.get(turnedOn - i)) {
                    answer.add(h + ":" + m);
                }
            }
        }

        return answer;
    }
}