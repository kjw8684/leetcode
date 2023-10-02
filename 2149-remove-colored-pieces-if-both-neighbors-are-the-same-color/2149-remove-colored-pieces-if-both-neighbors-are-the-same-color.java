class Solution {
    public boolean winnerOfGame(String colors) {
        int alice = 0, bob = 0;

        for (int i = 1; i < colors.length() - 1; i++) {
            boolean three_in_a_row = colors.charAt(i - 1) == colors.charAt(i) && colors.charAt(i) == colors.charAt(i + 1);
            if (three_in_a_row) {
                if (colors.charAt(i) == 'A') {
                    alice++;
                }else {
                    bob++;
                }
            }
        }
        return alice > bob ? true : false;
    }
}