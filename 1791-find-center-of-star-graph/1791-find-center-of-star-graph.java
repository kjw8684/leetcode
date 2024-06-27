class Solution {
    public int findCenter(int[][] edges) {
        int len = edges.length, answer = 0, count = 0, num1, num2;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < len; i++) {
            num1 = edges[i][0];
            num2 = edges[i][1];
            if(map.containsKey(num1)) {
                map.put(num1, map.get(num1) + 1);
            }
            else {
                map.put(num1, 1);
            }
            
            if(map.containsKey(num2)) {
                map.put(num2, map.get(num2) + 1);
            }
            else {
                map.put(num2, 1);
            }
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(count < entry.getValue()) {
                count = entry.getValue();
                answer = entry.getKey();
            }
        }
        
        return answer;
    }
}