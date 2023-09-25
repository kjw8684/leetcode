class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map_s = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            boolean is_null = map_s.get( s.charAt(i) ) == null;
            if (is_null) {
                map_s.put (s.charAt(i), 0);
            }
            map_s.put (s.charAt(i), map_s.get( s.charAt(i) ) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            boolean found_difference = map_s.get( t.charAt(i) ) == null || map_s.get( t.charAt(i) ) == 0;
            if (found_difference) {
                return t.charAt(i);
            }else {
                map_s.put (t.charAt(i), map_s.get( t.charAt(i) ) - 1);
            }
        }

        return 'x';
    }
}