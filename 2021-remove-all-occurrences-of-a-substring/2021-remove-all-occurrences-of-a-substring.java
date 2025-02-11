class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        int len = part.length();

        while(true) {
            int index = sb.indexOf(part);
            if (index != -1) { 
                sb.delete(index, index + len);
            }
            else {
                break;
            }
        }

        return sb.toString();
    }
}