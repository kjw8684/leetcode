class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) {
            return s;
        }
        int len = s.length(), count = 0;
        boolean check = true;
        List<List<Character>> list = new ArrayList<>();

        for(int i = 0; i < numRows; i++) {
            list.add(new ArrayList<>());
        }
        list.get(0).add(s.charAt(0));

        for(int i = 1; i < len; i++) {
            if(check) {
                count++;
                if(count == numRows - 1) {
                    check = false;
                }
            }
            else {
                count--;
                if(count == 0) {
                    check = true;
                }
            }
            list.get(count).add(s.charAt(i));
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < numRows; i++) {
            for (Character ch : list.get(i)) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}