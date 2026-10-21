class Solution {
    public int minOperations(String s) {
        int len = s.length();
        if(len == 1) {
            return 0;
        }
        if(len == 2 && s.charAt(0) > s.charAt(1)) {
            return -1;
        }

        boolean sort = true;
        int min = 27, max = -1, before = -1, first = s.charAt(0) - 'a', last = s.charAt(len - 1) - 'a', mincount = 0, maxcount = 0;

        for(int i = 0; i < len; i++) {
            int cur = s.charAt(i) - 'a';

            if(min == cur) {
                mincount++;
            }
            if(max == cur) {
                maxcount++;
            }
            if(min > cur) {
                min = cur;
                mincount = 0;
            }
            if(max < cur) {
                max = cur;
                maxcount = 0;
            }

            if(sort && before > cur) {
                sort = false;
            }

            before = cur;
        }

        if(sort) {
            return 0;
        }
        if(min == first || max == last) {
            return 1;
        }
        if(min == last && max == first && mincount == 0 && maxcount == 0) {
            return 3;
        }

        return 2;
    }
}