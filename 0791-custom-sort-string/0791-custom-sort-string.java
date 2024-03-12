class Solution {
    public String customSortString(String order, String s) {
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        String[] answer = new String[len];
        
        for(int i = 0; i < len; i++) {
            answer[i] = String.valueOf(s.charAt(i));
        }
        
        Arrays.sort(answer, (e1, e2) -> {
            boolean contains1 = order.contains(e1), contains2 = order.contains(e2);
            
            if(contains1 && contains2) {
                int index1 = order.indexOf(e1.charAt(0)), index2 = order.indexOf(e2.charAt(0));
                if(index1 > index2) {
                    return 1;
                }
                if(index1 < index2) {
                    return -1;
                }
                return 0;
            }
            
            if(contains1) {
                return 1;
            }
            
            if(contains2) {
                return -1;
            }
            
            
            return e1.compareTo(e2);
        });
        
        for(int i = 0; i < len; i++) {
            sb.append(answer[i]);
        }
        
        return sb.toString();
    }
}