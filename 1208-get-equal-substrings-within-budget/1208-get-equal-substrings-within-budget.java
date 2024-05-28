class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int len = s.length(), maxLength = 0, tempCost = 0, tempLength = 0;
        int[] dif = new int[len];
        
        for(int i = 0; i < len; i++) {
            dif[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }
        
        for(int i = 0; i < len; i++) {
            if(len - i < maxLength){
                break;
            }
            tempCost = maxCost;
            tempLength = 0;
            for(int j = i; j < len; j++) {
                if(tempCost >= dif[j]) {
                    tempCost -= dif[j];
                    tempLength++;
                }
                else{
                    break;
                }
            }
            maxLength = Math.max(maxLength, tempLength);
            
        }
        
        return maxLength;
    }
}