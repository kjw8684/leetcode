class Solution {
    public int minDeletionSize(String[] strs) {
        int size = strs.length, len = strs[0].length(), count = 0;
        boolean[] check = new boolean[size];
        check[0] = true;

        for(int i = 0; i < len; i++) {
            boolean[] curCheck = new boolean[size];
            boolean checkLex = true;
            char before = strs[0].charAt(i);
            for(int j = 1; j < size; j++) {
                char cur = strs[j].charAt(i);
                if(before < cur) {
                    curCheck[j] = true;
                }
                else if(before != cur && !check[j]){
                    checkLex = false;
                }
                before = cur;
            }

            if(checkLex) {
                boolean end = true;
                for(int j = 0; j < size; j++) {
                    check[j] |= curCheck[j];

                    if(!check[j]) {
                        end = false;
                    }
                }

                if(end) {
                    break;
                }
            }
            else {
                boolean end = true;
                for(int j = 0; j < size; j++) {
                    if(!(check[j] | curCheck[j])) {
                        end = false;
                        break;
                    }
                }

                if(end) {
                    break;
                }
                else {
                    count++;
                }
            }
        }

        return count;
    }
}