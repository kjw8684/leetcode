class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder(s);
        int plus = 0;

        for(int index : spaces) {
            sb.insert(index + plus, " ");
            plus++;
        }

        return sb.toString();
    }
}