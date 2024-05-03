class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\."), v2 = version2.split("\\.");
        int minlen = Math.min(v1.length, v2.length), cur1, cur2;
        
        for(int i = 0; i < minlen; i++) {
            cur1 = Integer.parseInt(v1[i]);
            cur2 = Integer.parseInt(v2[i]);
            if(cur1 < cur2) {
                return -1;
            }
            
            if(cur1 > cur2) {
                return 1;
            }
        }
        
        for(int i = minlen; i < v1.length; i++){
            if(Integer.parseInt(v1[i]) != 0) {
                return 1;
            }
        }
        
        for(int i = minlen; i < v2.length; i++) {
            if(Integer.parseInt(v2[i]) != 0) {
                return -1;
            }
        }
        
        return 0;
    }
}