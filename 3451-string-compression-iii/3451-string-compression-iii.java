class Solution {
    public String compressedString(String word) {
        int len = word.length(), count = 1;
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < len; i++) {
            if(word.charAt(i) == word.charAt(i - 1)) {
                count++;
            }
            else if (count != 0){
                sb.append(Integer.toString(count) + word.charAt(i - 1));
                count = 1;
            }
            else {
                count = 1;
            }

            if(count == 9) {
                sb.append("9" + word.charAt(i));
                count = 0;
            }
        }

        if(count != 0) {
            sb.append(Integer.toString(count) + word.charAt(len - 1));
        }

        return sb.toString();
    }
}