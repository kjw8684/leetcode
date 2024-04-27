class Solution {
    public int findRotateSteps(String ring, String key) {
        int len = ring.length(), klen = key.length(), min = Integer.MAX_VALUE, first;
        int[] answer = new int[len], temp = new int[len];
        Map<Character, ArrayList<Integer>> map = new HashMap<>();
        
        for(int i = 0; i < len; i++) {
            map.putIfAbsent(ring.charAt(i), new ArrayList<>());
            map.get(ring.charAt(i)).add(i);
        }
        
        for(Integer value : map.get(key.charAt(0))) {
            answer[value] = Math.min(value, len - value) + 1;
        }
        
        for(int i = 1; i < klen; i++) {
            first = 0;
            for(Integer for_value : map.get(key.charAt(i - 1))) {
                for(Integer cur_value : map.get(key.charAt(i))) {
                    if(first == 0) {
                        temp[cur_value] = answer[for_value] + Math.min(Math.abs(cur_value - for_value), len - Math.abs(cur_value - for_value)) + 1;
                    }
                    else{
                        temp[cur_value] = Math.min(temp[cur_value], answer[for_value] + Math.min(Math.abs(cur_value - for_value), len - Math.abs(cur_value - for_value)) + 1);
                    }
                }
                first = 1;
            }
            for(Integer cur_value : map.get(key.charAt(i))) {
                answer[cur_value] = temp[cur_value];
            }
        }
        
        for(Integer value : map.get(key.charAt(klen - 1))) {
            min = Math.min(min, answer[value]);
        }
        
        return min;
    }
}