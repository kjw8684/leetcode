class Solution {
    public boolean isIsomorphic(String s, String t) {
        int len = s.length();
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        
        for(int i = 0; i < len; i++) {
            if(!map.containsKey(s.charAt(i))) {
                if(map.containsValue(t.charAt(i))) {
                    return false;
                }
                map.put(s.charAt(i), t.charAt(i));
                continue;
            }
            
            if(map.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }
}