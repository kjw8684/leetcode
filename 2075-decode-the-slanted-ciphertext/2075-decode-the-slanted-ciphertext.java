class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int len = encodedText.length() / rows, index = 0;
        boolean check = false;
        StringBuilder sb = new StringBuilder();
        char[][] map = new char[rows][len];

        int count = 0;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < len; j++) {
                map[i][j] = encodedText.charAt(count);
                count++;
            }
        }

        for(int i = 0; i < len; i++) {
            int start = i;
            for(int j = 0; j < rows && start < len; j++) {
                if(!check && map[j][i + j] == ' ') {
                    index = sb.length();
                    check = true;
                }
                else if(check && map[j][i + j] != ' '){
                    check = false;
                }
                sb.append(map[j][i + j]);
                start++;
            }
        }

        if(check) {
            return sb.toString().substring(0, index);
        }

        return sb.toString();
    }
}