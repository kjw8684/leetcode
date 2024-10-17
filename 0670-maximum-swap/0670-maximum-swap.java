class Solution {
    public int maximumSwap(int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        char now = '0', compare = '0';
        int max_index = -1, len = sb.length();
        
        for(int i = 0; i < len; i++) {
            now = sb.charAt(i);
            for(int j = i + 1; j < len; j++) {
                compare = sb.charAt(j);
                if(sb.charAt(i) < compare && now <= compare) {
                    now = compare;
                    max_index = j;
                }
            }

            if(max_index != -1) {
                compare = sb.charAt(i);
                sb.setCharAt(i, now);
                sb.setCharAt(max_index, compare);
                break;
            }
        }

        return Integer.parseInt(sb.toString());
    }
}